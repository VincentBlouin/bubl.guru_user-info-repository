/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package org.triple_brain.module.repository.user;

public class ExistingUserException extends UserRepositoryException {
    public ExistingUserException(String userNameOrEmail) {
        super("A user already exist with username or email: " + userNameOrEmail);
    }
}
