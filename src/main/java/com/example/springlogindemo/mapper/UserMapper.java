package com.example.springlogindemo.mapper;

import com.example.springlogindemo.domain.Users;
import com.example.springlogindemo.domain.requestDto.UserRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper map= Mappers.getMapper(UserMapper.class);
    Users requestToEntity(UserRequestDto requestDto);
}
