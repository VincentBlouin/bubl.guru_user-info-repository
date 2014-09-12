/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
 */

package org.triple_brain.module.repository.user;

public class NonExistingUserException extends UserRepositoryException {
    public NonExistingUserException(String identifier) {
        super("User not found: " + identifier);
    }
}
