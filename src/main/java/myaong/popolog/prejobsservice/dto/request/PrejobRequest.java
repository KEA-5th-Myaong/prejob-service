package myaong.popolog.prejobsservice.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.util.List;

@Getter
public class PrejobRequest {

    @NotEmpty(message = "최소 하나 이상의 직군을 선택해야 합니다.")
    @Size(min = 1, max = 5, message = "최소 1개, 최대 5개의 직군을 선택해야 합니다.")
    private List<Long> preJob;
}
