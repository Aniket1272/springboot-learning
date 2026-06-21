package com.example.crazycoder.interviewprep.repository.jpa;

import com.example.crazycoder.interviewprep.entity.Employee;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEmployeeRepository {

    @PersistenceContext
    private jakarta.persistence.EntityManager em;

    public Employee findByNameAndDepartment(String name, String department) {
        String jpql = "SELECT e FROM Employee e WHERE e.name = :name AND e.department = :department";
        return em.createQuery(jpql, Employee.class)
                .setParameter("name", name)
                .setParameter("department", department)
                .getSingleResult();
    }
}
