package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.RegisterDao;
import com.basedatos.basededatos.models.RegisterModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin
@Transactional

public class RegisterDaoImp implements RegisterDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<RegisterModel> getRAll(){
        String hql = "FROM RegisterModel as u";
        return (List< RegisterModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public RegisterModel getR( long id){
        return entityManager.find(RegisterModel.class, id);
        // TODO: find -> Select * from where id = id (Modelo, id)

    }
    @Transactional
    @Override
    public RegisterModel registerR( RegisterModel registerModel){
        entityManager.merge(registerModel); // TODO: merge => INSERT
        return registerModel;
    }
    @Transactional
    @Override
    public RegisterModel updateR( RegisterModel registerModel){
        entityManager.merge(registerModel);
        return registerModel;
    }
    @Transactional
    @Override
    public void deleteR(  long id){
        RegisterModel registerModel = getR(id);
        entityManager.remove(registerModel); // TODO: remove(modelo) => delete
    }
}