package collection.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManagementSystem {
    private ArrayList<Student> list;

    public StudentManagementSystem() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentManagementSystem{" +
                "list=" + list +
                '}';
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void removeStudentById(int id) {
        Iterator<Student> studentIterator = list.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getId() == id) {
                studentIterator.remove();
            }
        }
        for (Student student : list) {
            System.out.println(student);
        }

    }

    public Student findStudentById(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student;

            }
        }
        return null;
    }


    public void showAllStudents() {
        for (Student student : list) {
            System.out.println(student);
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student(1, "Aygun", "27", "100");
        Student student2 = new Student(2, "Gunel", "25", "90");
        Student student3 = new Student(3, "Ayten", "28", "85");
        Student student4 = new Student(4, "Arzu", "22", "95");
        Student student5 = new Student(5, "Medine", "24", "88");
        Student student6 = new Student(6, "Cemile", "29", "75");
        Student student7 = new Student(7, "Nigar", "21", "70");


        StudentManagementSystem managementSystem = new StudentManagementSystem();
        managementSystem.addStudent(student1);
        managementSystem.addStudent(student2);
        managementSystem.addStudent(student3);
        managementSystem.addStudent(student4);
        managementSystem.addStudent(student5);
        managementSystem.addStudent(student6);
        managementSystem.addStudent(student7);

        //findstudentById metodu
        Student student = managementSystem.findStudentById(2);
        System.out.println(student);

        //showAllStudents metodu
        managementSystem.showAllStudents();

        //remove metodu
        managementSystem.removeStudentById(1);

    }
}
