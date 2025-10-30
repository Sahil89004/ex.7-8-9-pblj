package com.example.hibernatecrud;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        dao.saveStudent(new Student("Amit", "Java"));
        dao.saveStudent(new Student("Neha", "Python"));

        // Read
        List<Student> list = dao.getStudents();
        list.forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getCourse()));

        // Update
        dao.updateStudent(1, "Spring Boot");

        // Delete
        dao.deleteStudent(2);
    }
}
