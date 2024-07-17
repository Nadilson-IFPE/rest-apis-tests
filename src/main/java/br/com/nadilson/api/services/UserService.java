package br.com.nadilson.api.services;

import br.com.nadilson.api.domain.User;

public interface UserService {

    User findById(Integer id);

}
