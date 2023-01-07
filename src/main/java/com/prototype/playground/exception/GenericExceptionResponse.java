package com.prototype.playground.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GenericExceptionResponse {

    private final int status;
    private final String httpStatus;
    private final String exception;
    private final String message;
    private final String debugMessage;
    private final String requestUrl;

    private GenericExceptionResponse(Builder builder) {
        this.status = builder.status;
        this.httpStatus = builder.httpStatus;
        this.exception = builder.exception;
        this.message = builder.message;
        this.debugMessage = builder.debugMessage;
        this.requestUrl = builder.requestUrl;
    }

    public int getStatus() {
        return status;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public String getException() {
        return exception;
    }

    public String getMessage() {
        return message;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public static class Builder {
        private int status;
        private String httpStatus;
        private String exception;
        private String message;
        private String debugMessage;
        private String requestUrl;

        public Builder addStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder addHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder addException(String exception) {
            this.exception = exception;
            return this;
        }

        public Builder addMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder addDebugMessage(String debugMessage) {
            this.debugMessage = debugMessage;
            return this;
        }

        public Builder addRequestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }

        public GenericExceptionResponse build() {
            return new GenericExceptionResponse(this);
        }
    }

}

