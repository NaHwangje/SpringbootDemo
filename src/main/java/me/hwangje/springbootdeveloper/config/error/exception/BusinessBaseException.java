package me.hwangje.springbootdeveloper.config.error.exception;

import me.hwangje.springbootdeveloper.config.error.ErrorCode;

public class BusinessBaseException {

    public class CustomBaseException extends RuntimeException{

        private final ErrorCode errorCode;

        public CustomBaseException(String message, ErrorCode errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public CustomBaseException(ErrorCode errorCode) {
            super(errorCode.getMessage());
            this.errorCode = errorCode;
        }

        public ErrorCode getErrorCode() {
            return errorCode;
        }
    }
}
