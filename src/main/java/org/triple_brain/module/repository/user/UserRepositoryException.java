/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package org.triple_brain.module.repository.user;

public class UserRepositoryException extends RuntimeException {

    public UserRepositoryException(String message) {
        super(message);
    }

    public UserRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }

}
