package br.com.mardoqueu.userapi.services;

import br.com.mardoqueu.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();


}
