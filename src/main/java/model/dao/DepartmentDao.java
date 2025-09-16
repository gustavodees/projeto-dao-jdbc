package model.dao;

import model.Department;

import java.util.List;

public interface DepartmentDao {

    void inserir(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
