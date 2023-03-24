package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.imp.GasDaoImp;
import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProfileTwoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@CrossOrigin
@Service

public class GasService {
    @Autowired
    GasDaoImp GasDao;

    public List<GasModel> getAll(){
        return GasDao.getGAll();
    }
    public GasModel register( GasModel gasModel){
        return GasDao.registerG(gasModel);
    }

    public void delete(@PathVariable long id){
        GasDao.deleteG(id);
    }
}
