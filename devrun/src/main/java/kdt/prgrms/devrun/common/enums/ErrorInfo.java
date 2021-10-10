package kdt.prgrms.devrun.common.enums;

import lombok.Getter;

@Getter
public enum ErrorInfo {

    USER_NOT_FOUND("USER_NOT_FOUND","사용자를 찾을 수 없습니다."),
    POST_NOT_FOUND("POST_NOT_FOUND","게시글을 찾을 수 없습니다."),
    UNKNOWN("UNKNOWN", "서버 에러로 인해 데이터를 로드 힐 수 없습니다.");

    ErrorInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

}