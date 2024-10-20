package myaong.popolog.prejobsservice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import myaong.popolog.prejobsservice.common.exception.ApiResponse;
import myaong.popolog.prejobsservice.dto.request.PrejobRequest;
import myaong.popolog.prejobsservice.dto.response.PrejobResponse;
import myaong.popolog.prejobsservice.service.PrejobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pre-jobs")
@RequiredArgsConstructor
public class PrejobController {

    private final PrejobService prejobService;

    // 관심 직군 목록 조회 (카테고리별)
    @GetMapping("/jobs")
    public ResponseEntity<ApiResponse<List<PrejobResponse>>> getAvailableJobs() {
        List<PrejobResponse> response = prejobService.getAvailableJobs();
        return ResponseEntity.ok(ApiResponse.onSuccess(response));
    }

    // 회원의 관심 직군 목록 조회
    @GetMapping("/")
    public ResponseEntity<ApiResponse<List<PrejobResponse.JobDetail>>> getMemberPrejobs() {
        List<PrejobResponse.JobDetail> response = prejobService.getPrejobsForMember(5L);  // memberId 5 고정
        return ResponseEntity.ok(ApiResponse.onSuccess(response));
    }

    // 관심 직군 등록/수정
    @PostMapping("/")
    public ResponseEntity<ApiResponse<Object>> savePrejobs(@Valid @RequestBody PrejobRequest prejobRequest) {
        prejobService.savePrejobs(5L, prejobRequest);  // memberId 5 고정
        return ResponseEntity.ok(ApiResponse.onSuccess(null));
    }
}
