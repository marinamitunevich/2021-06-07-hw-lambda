package cw;

public class Student {
    private String name;
    private int note;

    public Student(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", note=" + note +
                '}';
    }
}
