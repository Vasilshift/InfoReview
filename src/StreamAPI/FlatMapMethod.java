package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class FlatMapMethod {
    public static void main(String[] args) {
        Student st1 = new Student("Sasha", 12);
        Student st2 = new Student("Masha", 19);
        Student st3 = new Student("Misha", 56);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Phsychology");

        f1.addStudentsOnFaculty(st1);
        f1.addStudentsOnFaculty(st2);
        f2.addStudentsOnFaculty(st3);

        List<Faculty> listOfFaculty = new ArrayList<>();

        listOfFaculty.add(f1);
        listOfFaculty.add(f2);

        //Output all students from all faculties

        listOfFaculty.stream().flatMap(faculty -> faculty.getListstudent().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Faculty {
    String nameFaculty;
    List<Student> studentOnFaculty = new ArrayList<>();

    public Faculty(String nameFaculty, List<Student> studentOnFaculty) {
        this.nameFaculty = nameFaculty;
        this.studentOnFaculty = new ArrayList<>();
    }

    public Faculty(String faculty) {
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Student> getListstudent() {
        return studentOnFaculty;
    }

    public void setListstudent(List<Student> liststudent) {
        this.studentOnFaculty = studentOnFaculty;
    }

    public void addStudentsOnFaculty(Student student) {
        studentOnFaculty.add(student);
    }
}
