package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.RegisterModel;

import com.basedatos.basededatos.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")

public class RegisterController {
    @Autowired
    RegisterService registerService;

    @GetMapping("/getAll")
    List<RegisterModel> getAll(){
        return registerService.getAll();
    }

    @PostMapping(value = "/create")
    RegisterModel create(@RequestBody RegisterModel registerModel){
        return registerService.register(registerModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        registerService.delete(id);
    }
}