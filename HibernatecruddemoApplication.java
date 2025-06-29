package com.hiberanate.hibernatecruddemo;

import com.hiberanate.hibernatecruddemo.Dao.StudentDao;
import com.hiberanate.hibernatecruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernatecruddemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(HibernatecruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner ->{
			System.out.println("HEllo world");
//		createStudent(studentDao);
//		queryStudent(studentDao);
//		updateStudent(studentDao);
		deleteStudent(studentDao);

	};


}

	private void deleteStudent(StudentDao studentDao) {
		int stdid=2;
		studentDao.delete(stdid);
		System.out.println(stdid+"Deleted Successfully");
	}

//	private void updateStudent(StudentDao studentDao) {
//		int stdid=2;
//		Student thestudent=studentDao.findbyId(stdid);
//		thestudent.setFirstname("Vikram");
//		studentDao.update(thestudent);
//	}
	}

//	private void createStudent(StudentDao studentDao) {
//		Student tempStudent = new Student("Vijayramn", "Ramesh", "rameshnvijay9112@gmail.com");
//		studentDao.save(tempStudent);
//		System.out.println("Student " + tempStudent.getId());
//		System.out.println("Found the std: " + studentDao.findbyId(tempStudent.getId()));
//	}
//	private void queryStudent(StudentDao studentDao){
//		List<Student> thestudent1=studentDao.findAll();
//		for(Student stud:thestudent1){
//			System.out.println(stud);
//		}
//	}
