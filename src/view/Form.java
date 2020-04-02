package view;

import model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Form {

    public static int mainMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Display list student");
        System.out.println("2. Add new student");
        System.out.println("3. Edit student by ID");
        System.out.println("4. Delete student by ID");
        System.out.println("5. Display student info by ID");
        System.out.println("6. Display student info by Name");
        System.out.println("7. Student have scholarship");
        System.out.println("8. Display female student");
        System.out.println("================================");
        System.out.println("0. Quit");
        option = Integer.parseInt(br.readLine());
        return option;
    }

    public static void scholarshipForm() {
        System.out.println("========== STUDENT HAVE SCHOLARSHIP ==========");
    }

    public static void isFemaleForm() {
        System.out.println("========== FEMALE STUDENT ==========");
    }

    public static String enterIDForm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("========== ENTER ID FORM ==========");
        System.out.print("Enter id:");
        value = br.readLine();
        return value;
    }

    public static String enterNameForm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("========== ENTER NAME FORM ==========");
        System.out.print("Enter name:");
        value = br.readLine();
        return value;
    }

    public static Student inputStudentForm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===INPUT INFORMATION - STUDENT ===");
        System.out.print("1.Enter name:");
        String name = br.readLine();
        System.out.print("2.Enter gender:");
        String gender = br.readLine();
        System.out.print("3.Enter birthday:");
        String birthday = br.readLine();
        System.out.print("4.Enter address:");
        String address = br.readLine();
        System.out.print("5.Enter id:");
        String id = br.readLine();
        System.out.print("6.Enter score:");
        float score = Float.parseFloat(br.readLine());
        System.out.print("7.Enter email:");
        String email = br.readLine();
        Student newStudent = new Student(name, gender, birthday, address, id, score, email);
        return newStudent;
    }

    public static void displayStudentForm() {
        System.out.printf("%-20s%-10s%-10s%-15s%-10s%-10s%-10s\n","Name","Gender","Birthday","Address","ID","Score","Email");
    }
}
