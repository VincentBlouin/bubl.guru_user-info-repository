package org.triple_brain.module.repository.user.user;

import org.triple_brain.module.model.User;

/**
 * @author Vincent Blouin
 */
public interface UserRepository {
    void save(User user);
}
