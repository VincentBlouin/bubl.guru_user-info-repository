package org.triple_brain.module.repository.user.user;

/**
 * @author Vincent Blouin
 */
public class ExistingUserException extends UserRepositoryException {
    public ExistingUserException(String email) {
        super("A user already exist with email: " + email);
    }
}
