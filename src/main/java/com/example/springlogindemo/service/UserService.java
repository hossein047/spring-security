package com.example.springlogindemo.service;

import com.example.springlogindemo.domain.Users;
import com.example.springlogindemo.domain.requestDto.UserRequestDto;
import com.example.springlogindemo.mapper.UserMapper;
import com.example.springlogindemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    private final UserMapper mapper;
    private final UserRepository repository;

    public UserService(UserMapper mapper, UserRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public Users save(UserRequestDto dto){

        Users users =mapper.requestToEntity(dto);
        repository.save(users);
        return users;

    }
    public List<Users> findAll(){
        return  repository.findAll();
    }
}
