package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.RegisterDaoImp;
import com.basedatos.basededatos.models.RegisterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@CrossOrigin
@Service


public class RegisterService {
    @Autowired
    RegisterDaoImp RegisterDao;

    public List<RegisterModel> getAll(){
        return RegisterDao.getRAll();
    }
    public RegisterModel register( RegisterModel registerModel){
        return RegisterDao.registerR(registerModel);
    }

    public void delete(@PathVariable long id){
        RegisterDao.deleteR(id);
    }
}
