/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
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
