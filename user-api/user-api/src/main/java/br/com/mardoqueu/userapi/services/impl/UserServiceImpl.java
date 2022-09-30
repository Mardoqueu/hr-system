package br.com.mardoqueu.userapi.services.impl;

import br.com.mardoqueu.userapi.domain.User;
import br.com.mardoqueu.userapi.reprositories.UserRepository;
import br.com.mardoqueu.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}