public class Student implements Comparable<Student> {
    int group;
    String name;

    public Student(int group, String name) {
        this.group = group;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "group=" + group +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.group > student.group) {
            return 1;
        } else if (this.group < student.group) {
            return -1;
        } else
            return 0;
    }
}
