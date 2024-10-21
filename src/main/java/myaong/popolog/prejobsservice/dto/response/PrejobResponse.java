package myaong.popolog.prejobsservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PrejobResponse {
    private String categoryName; // 카테고리 이름
    private List<JobDetail> jobs; // 직군 리스트

    @Getter
    @AllArgsConstructor
    public static class JobDetail {
        private Long jobId;
        private String jobName;
    }
}
