package myaong.popolog.prejobsservice.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ApiCode {

	OK(HttpStatus.OK, "COMMON_2000", "OK"),
	INVALID_DATA(HttpStatus.BAD_REQUEST, "COMMON_4000", "Request data missing or invalid"),
	METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "COMMON_4050", "Method not allowed"),
	INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_5000", "Internal Server Error"),
	DB_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_5001", "DB Error"),

	CATEGORY_DUPLICATED(HttpStatus.CONFLICT, "JOB_4090", "이미 존재하는 카테고리 이름입니다."),
	CATEGORY_CONFLICT(HttpStatus.CONFLICT, "JOB_4091", "해당 카테고리에 속하는 직군이 있어 삭제할 수 없습니다."),
	JOB_DUPLICATED(HttpStatus.CONFLICT, "JOB_4092", "해당 카테고리 내에 이미 존재하는 직군 이름입니다."),
	JOB_CONFLICT(HttpStatus.CONFLICT, "JOB_4093", "해당 직군을 선택한 회원이 있어 삭제할 수 없습니다."),
	;

	private final HttpStatus httpStatus;
	private final String code;
	private final String message;
}
