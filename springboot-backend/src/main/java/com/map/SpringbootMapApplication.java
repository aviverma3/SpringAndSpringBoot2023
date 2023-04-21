package com.map;

import com.map.entities.Laptop;
import com.map.entities.Student;
import com.map.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMapApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMapApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("new Applications");
        Student student = new Student();
        student.setStudentId(13);
        student.setStudentName("raviraj");
        student.setAbout("Software Eng");

        Laptop laptop = new Laptop();
        laptop.setLaptopId(123);
        laptop.setBrand("Dell");
        laptop.setModelNumber(587);
        laptop.setStudent(student);
        student.setLaptop(laptop);

        Student st =  studentRepository.save(student);
        log.info("Saved student: " + st.getStudentName());

    }
}
