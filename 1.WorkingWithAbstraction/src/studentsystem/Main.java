package studentsystem;

import studentsystem.utils.StudentUltils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            if (command.equals("Exit")) {
                break;
            }

            if (command.equals("Create")) {
                Student student = StudentUltils.parseStudent(input);
                studentSystem.addStudent(student);
            } else if (command.equals("Show")) {
                String studentInfo = studentSystem.getStudentInfo(input[1]);
                if(studentInfo != null){
                    System.out.println(studentInfo);
                }
            }
        }
    }
}
