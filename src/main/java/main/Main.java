package main;

import student.Student;

public class Main {

    
    public static void main(String[] args) {
        
        Student student = new Student();
        
        student.info();
        System.out.println("");
        
        student.setFirstName("Petar");
        student.setLastName("Petrovic");
        student.setYearOfBirth(1990);
        
        student.getCourse().setName("QA");
        student.getCourse().setNumberOfClasses(40);
        
        student.getComputer().setProcessTact(4.0);
        student.getComputer().setMemory(16.0);
        student.getComputer().setHardDrive(2000);
        
        student.info();
    }
    
}
