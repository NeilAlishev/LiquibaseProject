package com.example.LiquibaseProject.dao;

import com.example.LiquibaseProject.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("select * from person", this::mapRowToPerson);
    }

    private Person mapRowToPerson(ResultSet resultSet, int i) throws SQLException {
        return new Person(resultSet.getInt("id"),
                resultSet.getString("name"));
    }
}
