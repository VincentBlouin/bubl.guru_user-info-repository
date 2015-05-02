/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package org.triple_brain.module.repository.user;

public class NonExistingUserException extends UserRepositoryException {
    public NonExistingUserException(String identifier) {
        super("User not found: " + identifier);
    }
}
