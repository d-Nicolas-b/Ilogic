package com.ilogic.server.persistence.crud;

import com.ilogic.server.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);
}
