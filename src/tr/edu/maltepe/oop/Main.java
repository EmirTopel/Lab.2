package tr.edu.maltepe.oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

Professor professor = new Professor(123456,"Ensar","Gul");
Student student = new Student(123456,"Emir","Topel");

System.out.println(professor.getName() + " " +professor.getSurName() + " " + professor.getId());
System.out.println(student.getName() + " " +student.getSurName() + " " + student.getId());




    }
}
