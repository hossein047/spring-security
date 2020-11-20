package com.example.springlogindemo.controller;

import com.example.springlogindemo.domain.Users;
import com.example.springlogindemo.domain.requestDto.UserRequestDto;
import com.example.springlogindemo.service.UserService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long>save(@RequestBody UserRequestDto dto){
        try{
            Users users =service.save(dto);
            return new ResponseEntity<>(users.getUser_id(), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Users>>findAll(){

            return new ResponseEntity<>(service.findAll(),HttpStatus.OK);


   }
}
