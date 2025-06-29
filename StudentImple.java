package com.hiberanate.hibernatecruddemo.Dao;

import com.hiberanate.hibernatecruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class StudentImple implements StudentDao {
    private EntityManager entityManager;
    @Autowired
    public StudentImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findbyId(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> fromStudent= entityManager.createQuery("from Student where firstname='Vijay' or lastname='Ram'",Student.class);
        List<Student> fromStudentList=fromStudent.getResultList();
        return fromStudentList;
    }

    @Override
    @Transactional
    public void update(Student student) {

        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student student=entityManager.find(Student.class,id);
        entityManager.remove(student);
    }
}



