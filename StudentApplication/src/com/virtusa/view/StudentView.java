package com.virtusa.view;

import java.util.List;
import java.util.Scanner;

import com.virtusa.controller.StudentController;
import com.virtusa.model.StudentModel;

public class StudentView {
	
	public void mainMenu(){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Register student");
		System.out.println("2. View student");
		System.out.print("Enter option:");
		int option=scanner.nextInt();
		StudentView studentView=new StudentView();

		if(option==1){
		studentView.registerStudentForm();
		}
		if(option==2){
           StudentController studentController=new StudentController();
           studentController.viewStudent();
		}
		
		
	}
	
	public void registerStudentForm(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Student Roll No");
		int rollNo=scanner.nextInt();
		
		System.out.print("Student FirstName:");
		String firstName=scanner.next();
		
		System.out.print("Student LastName:");
		String lastName=scanner.next();
		
		System.out.print("Student Email:");
		String email=scanner.next();
		

		System.out.print("Student PhoneNumber:");
		String phoneNumber=scanner.next();
		
		
		System.out.print("Course Id:");
		int courseId=scanner.nextInt();
		
		StudentModel studentModel=new StudentModel();
		studentModel.setCourseId(courseId);
		studentModel.setEmail(email);
		studentModel.setFirstName(firstName);
		studentModel.setLastName(lastName);
		studentModel.setRollNo(rollNo);
		studentModel.setPhoneNumber(phoneNumber);
		
		StudentController studentController=new StudentController();
		studentController.storeStudent(studentModel);
		mainMenu();
		
	}
	
	
	public void storeSuccessful(){
		
		System.out.println("Student registered successful");
	}
	
    public void storeUnSuccessful(){
		
		System.out.println("Student registered unsuccessful");
	}
    
    
    
    public void displayStudentDetails(List<StudentModel> studentModel){
    	
    	studentModel.forEach(System.out::println);
    }

}
