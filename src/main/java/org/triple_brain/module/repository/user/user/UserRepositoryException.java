package org.triple_brain.module.repository.user.user;

/**
 * @author Vincent Blouin
 */
public class UserRepositoryException extends RuntimeException {

    public UserRepositoryException(String message) {
        super(message);
    }

    public UserRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

}
