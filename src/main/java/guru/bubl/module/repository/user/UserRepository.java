/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package guru.bubl.module.repository.user;

import guru.bubl.module.model.User;
import guru.bubl.module.model.forgot_password.UserForgotPasswordToken;

public interface UserRepository {
    User createUser(User user);
    User findByUsername(String username) throws NonExistingUserException;
    User findByEmail(String email) throws NonExistingUserException;
    Boolean usernameExists(String username);
    Boolean emailExists(String email);
    void generateForgetPasswordToken(User user, UserForgotPasswordToken userForgotPasswordToken);
    UserForgotPasswordToken getUserForgetPasswordToken(User user);
    void changePassword(User user);
}
