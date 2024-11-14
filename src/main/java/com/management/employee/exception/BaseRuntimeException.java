package com.management.employee.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Custom runtime exception class for the employee management application. This exception extends the standard
 * RuntimeException to provide additional context for error handling, specifically allowing for an associated parameter
 * to be included with the exception.
 */
public class BaseRuntimeException extends RuntimeException {

    /**
     * A parameter associated with the exception. This can be used to provide additional context about the error.
     */
    @Getter
    @Setter
    private String param;

    /**
     * Constructs a new BaseRuntimeException with the specified detail message, parameter, and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link Throwable#getMessage()}
     *                method)
     * @param param   the parameter associated with the exception
     * @param cause   the cause (which is saved for later retrieval by the {@link Throwable#getCause()} method). (A null
     *                value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public BaseRuntimeException(String message, String param, Throwable cause) {
        super(message, cause);
        this.param = param;
    }

    /**
     * Constructs a new BaseRuntimeException with the specified detail message and parameter.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link Throwable#getMessage()}
     *                method)
     * @param param   the parameter associated with the exception
     */
    public BaseRuntimeException(String message, String param) {
        super(message);
        this.param = param;
    }

}
