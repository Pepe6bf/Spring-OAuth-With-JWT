package com.study.springauth.domain.auth.exception.oauth;

import com.study.springauth.global.error.ErrorCdoe;
import lombok.Getter;

@Getter
public class OAuthProviderMissMatchException extends RuntimeException {
    private final ErrorCdoe errorCdoe;
    private final String detailMessage;

    public OAuthProviderMissMatchException(ErrorCdoe errorCode) {
        this.errorCdoe = errorCode;
        this.detailMessage = errorCode.getMessage();
    }

    public OAuthProviderMissMatchException(ErrorCdoe errorCode, String detailMessage) {
        this.errorCdoe = errorCode;
        this.detailMessage = detailMessage;
    }
}
