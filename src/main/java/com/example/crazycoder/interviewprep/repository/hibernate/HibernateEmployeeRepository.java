package com.example.crazycoder.interviewprep.repository.hibernate;

import com.example.crazycoder.interviewprep.entity.Employee;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateEmployeeRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public Employee findByNameAndDepartment(String name, String department) {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Employee WHERE name = :name AND department = :department";
            return session.createQuery(hql,Employee.class)
                    .setParameter("name", name)
                    .setParameter("department", department)
                    .uniqueResult();
        }
    }
}
