package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.RegisterModel;


import java.util.List;

public interface RegisterDao {
    List<RegisterModel> getRAll();
    RegisterModel getR( long id);
    RegisterModel registerR( RegisterModel registerModel);
    RegisterModel updateR( RegisterModel registerModel);
    void deleteR(  long id);
}
