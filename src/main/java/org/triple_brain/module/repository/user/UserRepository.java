/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
 */

package org.triple_brain.module.repository.user;

import org.triple_brain.module.model.User;
import org.triple_brain.module.model.forget_password.UserForgetPasswordToken;

public interface UserRepository {
    User createUser(User user);
    User findByUsername(String username) throws NonExistingUserException;
    User findByEmail(String email) throws NonExistingUserException;
    Boolean usernameExists(String username);
    Boolean emailExists(String email);
    void generateForgetPasswordToken(User user);
    UserForgetPasswordToken getUserForgetPasswordToken(User user);
    void changePassword(User user);
}
