package br.com.nadilson.api.services;

import br.com.nadilson.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

}
