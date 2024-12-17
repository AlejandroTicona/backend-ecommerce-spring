package com.atic.ecommerce.backend.domain.port;

import com.atic.ecommerce.backend.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);

}
