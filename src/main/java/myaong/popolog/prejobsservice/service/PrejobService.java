package myaong.popolog.prejobsservice.service;

import lombok.RequiredArgsConstructor;
import myaong.popolog.prejobsservice.common.exception.ApiCode;
import myaong.popolog.prejobsservice.common.exception.ApiException;
import myaong.popolog.prejobsservice.dto.request.PrejobRequest;
import myaong.popolog.prejobsservice.dto.response.PrejobResponse;
import myaong.popolog.prejobsservice.entity.Category;
import myaong.popolog.prejobsservice.entity.Job;
import myaong.popolog.prejobsservice.entity.PreferredJob;
import myaong.popolog.prejobsservice.repository.CategoryRepository;
import myaong.popolog.prejobsservice.repository.PreferredJobRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor

public class PrejobService {

    private final PreferredJobRepository preferredJobRepository;
    private final CategoryRepository categoryRepository;

    // 카테고리별 선택 가능한 직군 목록 조회
    @Transactional(readOnly = true)
    public List<PrejobResponse> getAvailableJobs() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(category -> new PrejobResponse(
                        category.getName(),
                        category.getJobs().stream()
                                .map(job -> new PrejobResponse.JobDetail(job.getId(), job.getName()))
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }

    // 회원의 관심 직군 조회
    @Transactional(readOnly = true)
    public List<PrejobResponse.JobDetail> getPrejobsForMember(Long memberId) {
        List<PreferredJob> preferredJobs = preferredJobRepository.findByMemberId(memberId);
        return preferredJobs.stream()
                .map(job -> new PrejobResponse.JobDetail(job.getJob().getId(), job.getJob().getName()))
                .collect(Collectors.toList());
    }

    // 관심 직군 저장
    public void savePrejobs(Long memberId, PrejobRequest request) {
        if (request.getPreJob().size() > 5 || request.getPreJob().size() < 1) {
            throw new ApiException(ApiCode.INVALID_DATA, "관심 직군은 최소 1개, 최대 5개까지 선택할 수 있습니다.");
        }
    }
}
