package com.example.hibernatedemo;

import com.example.hibernatedemo.dao.StudentDAO;
import com.example.hibernatedemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLIneRunner(StudentDAO studentDAO) {
		return runner -> {
//		    createStudent(studentDAO);
//          createMultipleStudents(studentDAO);
//          readStudent(studentDAO);
//          readAllStudents(studentDAO);
//            findByLastName(studentDAO);
            updateStudent(studentDAO);
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

    private void createMultipleStudents(StudentDAO studentDAO) {

        //create multiple students
        System.out.println("Creating 3 Student Object ...");
        Student tempStudent1 = new Student("Sulabh","Mehra", "Suli@gmail.com");
        Student tempStudent2 = new Student("Arun","Bhau", "Arun@gmail.com");
        Student tempStudent3 = new Student("Vishal","Sharma", "Vishal@gmail.com");

        //Save Student Object
        System.out.println("Saving the students....");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    public void readStudent (StudentDAO studentDAO) {
        //Create Student Object
        System.out.println("Creating New Student Object ...");
        Student tempStudent = new Student("Sahib","Singh", "2000@gmail.com");

        //Save Student Object
        System.out.println("Saving the student");
        studentDAO.save(tempStudent);

        //read data through id
        Student student = studentDAO.findById(tempStudent.getId());
        System.out.println("Details of the student with id : " + tempStudent.getId() + ": " + student.toString() );
    }

    public void readAllStudents (StudentDAO studentDAO) {
        List<Student> list = studentDAO.findAll();
        for (Student student : list) {
            System.out.println("Students List as follows :  " + student);
        }
    }

    public void findByLastName (StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Sharma");
        for (Student student: students) {
            System.out.println("Last Name would be : " + student);
        }
    }

    public void updateStudent (StudentDAO studentDAO) {
        Student student = studentDAO.findById(1);
        student.setLastName("Singh");
        studentDAO.update(student);
    }

}

