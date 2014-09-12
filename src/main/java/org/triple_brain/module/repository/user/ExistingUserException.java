/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
 */

package org.triple_brain.module.repository.user;

public class ExistingUserException extends UserRepositoryException {
    public ExistingUserException(String userNameOrEmail) {
        super("A user already exist with username or email: " + userNameOrEmail);
    }
}
