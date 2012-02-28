package org.triple_brain.module.repository.user.user;

/**
 * @author Vincent Blouin
 */
public class NonExistingUserException extends UserRepositoryException {
    public NonExistingUserException(String identifier) {
        super("User not found: " + identifier);
    }
}
