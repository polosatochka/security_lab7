package com.example.students_security.service;

import com.example.students_security.dto.UserDto;
import com.example.students_security.entity.User;

import java.util.List;

public interface UserService {

    void saveUser (UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
