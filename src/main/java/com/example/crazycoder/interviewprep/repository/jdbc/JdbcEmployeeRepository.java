package com.example.crazycoder.interviewprep.repository.jdbc;

import com.example.crazycoder.interviewprep.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcEmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Employee findByNameAndDepartment(String name, String department) {
        String sql = "SELECT * FROM employee WHERE name = ? AND dep = ?";
        return jdbcTemplate.queryForObject(sql,new EmployeeRowMapper(), name, department);
    }
}

class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setDepartment(rs.getString("dep"));
        return employee;
    }
}
