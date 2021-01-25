
package week2lec1continueweek1studentlist;

import java.util.Scanner;

public class Week2Lec1ContinueWeek1StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //String[] students = new String[2]; //this creates an array of strings NOT of Students
        Student[] students = new Student[2];
        
        System.out.println("Enter Student names");
        
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < students.length; i++){
            System.out.println("Enter name for Student " + (i + 1));
            
            String name = input.nextLine();
            
            students[i] = new Student(name);
    }
        
        System.out.println("Here are the students");
        
        String format = "Student name is %s\n";
        
        for (Student student:students){ //for each student in students > basically what this is saying
            
            System.out.printf(format, student.getName());
        }
    }
    
}
