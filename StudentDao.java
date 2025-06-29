package com.hiberanate.hibernatecruddemo.Dao;

import com.hiberanate.hibernatecruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
     void save(Student student);
     Student findbyId(Integer id);
     List<Student> findAll();
     void update(Student student);
     void delete(Integer id);
}
