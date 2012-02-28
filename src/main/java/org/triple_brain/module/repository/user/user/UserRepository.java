package org.triple_brain.module.repository.user.user;
import org.codehaus.jettison.json.JSONException;
import org.triple_brain.module.model.User;
import org.codehaus.jettison.json.JSONObject;

/**
 * @author Vincent Blouin
 */
public interface UserRepository {
    void save(User user);
    User findById(String id) throws NonExistingUserException;
    User findByEmail(String email) throws NonExistingUserException;
    boolean emailExists(String email);
    JSONObject findByIdAsJson(String id) throws NonExistingUserException, JSONException;
}
