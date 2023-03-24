package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProfileTwoModel;
import com.basedatos.basededatos.services.GasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/gas")

public class GasController {
    @Autowired
    GasService gasService;

    @GetMapping("/getAll")
    List<GasModel> getAll(){
        return gasService.getAll();
    }

    @PostMapping(value = "/create")
    GasModel create(@RequestBody GasModel gasModel){
        return gasService.register(gasModel);
    }
    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        gasService.delete(id);
    }
}