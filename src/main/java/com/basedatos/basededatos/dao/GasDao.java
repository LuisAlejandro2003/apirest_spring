package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.GasModel;
import com.basedatos.basededatos.models.ProfileTwoModel;

import java.util.List;

public interface GasDao {
    List<GasModel> getGAll();
    GasModel getG( long id);
    GasModel registerG( GasModel gasModel);
    GasModel updateG( GasModel gasModel);
    void deleteG(  long id);
}
