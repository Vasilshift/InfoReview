package Collections.LearnComparable.src;

public class Students implements Comparable {
    int group;
    String name;

    public Students(int group, String name) {
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
    public int compareTo(Object o) {
        if (this.group > ((Students) o).group) {
            return 1;
        } else if (this.group < ((Students) o).group) return -1;
        else return 0;
    }
}
