package com.autoTest.model.repository;

import com.autoTest.common.Constant;
import com.autoTest.model.output.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

public class UserSteps {
    public void getUserEmailByName() {
        JdbcTemplate connectDB = Constant.JDBC_TEMPLATE;
        String sql = "SELECT * FROM student";
        // get data object to map List<Student>
        List<Student> studentList1 = connectDB.query(sql, new BeanPropertyRowMapper<>(Student.class));
        List<Student> studentList2 = connectDB.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            return student;
        });

        // get list id student map List<Integer>
        List<Integer> studentList3 = connectDB.queryForList("SELECT id FROM student", Integer.class);
        System.out.println("studentList1: " + Arrays.toString(studentList1.toArray()));
        System.out.println("studentList2: " + Arrays.toString(studentList2.toArray()));
        System.out.println("studentList3: " + Arrays.toString(studentList3.toArray()));
    }
}
