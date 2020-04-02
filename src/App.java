import model.Student;
import view.Form;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    private static void findStudentHaveScholarship(ArrayList studentList) {
        Iterator itr;
        Student selectedStudent;
        Form.scholarshipForm();
        itr = studentList.iterator();
        while (itr.hasNext()){
            selectedStudent =(Student) itr.next();
            if(selectedStudent.getScore()>8){
                Form.displayStudentForm(selectedStudent);
            }
        }
    }

    private static void findFemaleStudent(ArrayList studentList) {
        Iterator itr;
        Student selectedStudent;
        Form.isFemaleForm();
        itr = studentList.iterator();
        while (itr.hasNext()){
            selectedStudent =(Student) itr.next();
            if(selectedStudent.getGender().equals("female")||selectedStudent.getGender().equals("Female")){
                Form.displayStudentForm(selectedStudent);
            }
        }
    }

    private static void addNewStudent(ArrayList studentList) throws IOException {
        Student newStudent = Form.inputStudentForm();
        Student st = new Student(newStudent.getName(),newStudent.getGender(),newStudent.getBirthday(),newStudent.getAddress(),newStudent.getId(),newStudent.getScore(),newStudent.getEmail());
        studentList.add(st);
    }

    private static void displayStudentList(ArrayList studentList) {
        Iterator itr;
        itr = studentList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }

    private static void deleteStudent(ArrayList studentList) throws IOException {
        String selectedId;
        Iterator itr;
        Student selectedStudent;
        selectedId = Form.enterIDForm();
        itr = studentList.iterator();
        while (itr.hasNext()){
            selectedStudent =(Student) itr.next();
            if(selectedStudent.getId().equals(selectedId)){
                studentList.remove(selectedStudent);
                break;
            }
        }
    }

    private static void editStudent(ArrayList studentList) throws IOException {
        String selectedId;
        Iterator itr;
        Student selectedStudent;
        selectedId = Form.enterIDForm();
        itr = studentList.iterator();
        while (itr.hasNext()){
            selectedStudent =(Student) itr.next();
            if(selectedStudent.getId().equals(selectedId)) {
                int indexOFSelectedStudent = studentList.indexOf(selectedStudent);
                selectedStudent = Form.inputStudentForm();
                studentList.set(indexOFSelectedStudent, selectedStudent);
            }
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        int option = -1;
        ArrayList studentList = new ArrayList();

        Student st1 = new Student("BinhNguyen","Male","1991","HaNoi","No1",9,"binh@email.com");
        Student st2 = new Student("HoaiPham","Female","2000","ThaiBinh","No2",8,"hoai@email.com");
        Student st3 = new Student("LamNguyen","Male","1990","NinhBinh","No3",7,"lam@email.com");
        Student st4 = new Student("NguyenNguyen","Female","1995","NamDinh","No4",9,"nguyen@email.com");
        Student st5 = new Student("TienNguyen","Male","1997","HaNoi","No5",5,"tien@email.com");
        studentList.add(0,st1);
        studentList.add(1,st2);
        studentList.add(2,st3);
        studentList.add(3,st4);
        studentList.add(4,st5);

        while (option!=0){
            option = Form.mainMenu();
            Student selectedStudent;
            String selectedId;
            String selectedName;
            Iterator itr;
            switch (option){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    displayStudentList(studentList);
                    break;
                case 2:
                    addNewStudent(studentList);
                    break;
                case 3:
                    editStudent(studentList);
                    break;
                case 4:
                    deleteStudent(studentList);
                    break;
                case 5:
                    selectedId = Form.enterIDForm();
                    itr = studentList.iterator();
                    while (itr.hasNext()){
                        selectedStudent =(Student) itr.next();
                        if(selectedStudent.getId().equals(selectedId)){
                            Form.displayStudentForm(selectedStudent);
                        }
                    }
                    break;
                case 6:
                    selectedName = Form.enterNameForm();
                    itr = studentList.iterator();
                    while (itr.hasNext()){
                        selectedStudent =(Student) itr.next();
                        if(selectedStudent.getName().equals(selectedName)){
                            Form.displayStudentForm(selectedStudent);
                        }
                    }
                    break;
                case 7:
                    findStudentHaveScholarship(studentList);
                    break;
                case 8:
                    findFemaleStudent(studentList);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
