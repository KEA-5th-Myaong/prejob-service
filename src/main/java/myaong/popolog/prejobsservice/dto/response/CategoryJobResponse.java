package myaong.popolog.prejobsservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CategoryJobResponse {
    private String categoryName;
    private List<PrejobResponse> jobs;
}
