package com.management.employee.exception;

/**
 * Exception thrown when a requested resource is not found. This class extends BaseRuntimeException to provide a
 * specific type of runtime exception that can be used to indicate that an entity (such as an employee) could not be
 * found in the system.
 */
public class NotFoundException extends BaseRuntimeException {

    /**
     * Constructs a new NotFoundException with the specified detail message and associated parameter.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link Throwable#getMessage()}
     *                method)
     * @param param   the parameter associated with the exception, providing additional context about the missing
     *                resource
     */
    public NotFoundException(String message, String param) {
        super(message, param);
    }
}
