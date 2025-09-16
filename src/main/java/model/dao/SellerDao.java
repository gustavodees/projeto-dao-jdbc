package model.dao;

import model.Department;
import model.Seller;

import java.util.List;

public interface SellerDao {

    void inserir(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();




}


