package uk.co.devtest.exception;

public class UnknownException extends RuntimeException {

    public UnknownException(String message, Throwable ex) {
        super(message, ex);
    }

}
