package org.triple_brain.module.repository.user;

import org.triple_brain.model.User;

/**
 * @author Vincent Blouin
 */
public interface UserRepository {
    void save(User user);
}
