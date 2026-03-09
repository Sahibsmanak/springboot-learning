package com.example.hibernatedemo;

import com.example.hibernatedemo.dao.StudentDAO;
import com.example.hibernatedemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLIneRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

    private void createStudent(StudentDAO studentDAO) {
        //Create Student Object
        System.out.println("Creating New Student Object ...");
        Student tempStudent = new Student("Sahib","Singh", "2000@gmail.com");

        //Save Student Object
        System.out.println("Saving the student");
        studentDAO.save(tempStudent);

        //Display Id of saved student
        System.out.println("Saved Student ID : " + tempStudent.getId());
    }


}
