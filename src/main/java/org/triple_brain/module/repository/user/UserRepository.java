/*
 * Copyright Vincent Blouin under the Mozilla Public License 1.1
 */

package org.triple_brain.module.repository.user;
import org.codehaus.jettison.json.JSONException;
import org.triple_brain.module.model.User;
import org.codehaus.jettison.json.JSONObject;

public interface UserRepository {
    void createUser(User user);
    User findById(String id) throws NonExistingUserException;
    User findByUsername(String username) throws NonExistingUserException;
    User findByEmail(String email) throws NonExistingUserException;
    Boolean usernameExists(String username);
    Boolean emailExists(String email);
}
