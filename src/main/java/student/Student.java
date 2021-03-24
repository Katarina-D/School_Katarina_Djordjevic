package student;

import computer.Computer;
import course.Course;


public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.yearOfBirth = 0;
        Course course = new Course();
//       course.setName("QA");
//       course.setNumberOfClasses(3);
//       course.setCodeName("123");
        this.course = course;
        
        Computer computer = new Computer();
        this.computer = computer;
        
    }
    
    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer() {
        return this.computer;
    }
    
    
    
    public void info() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        
        System.out.println("Course name: " + getCourse().getName());
        System.out.println("Course number of classes: " + getCourse().getNumberOfClasses());
        
        System.out.println("Process tact: " + getComputer().getProcessTact());
        System.out.println("Memory: " + getComputer().getMemory());
        System.out.println("Hard driver: " + getComputer().getHardDrive());
    }
    
}
