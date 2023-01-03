

public class Student {
    private int id;
    private String name;
    private int score;

    public Student() {
    }
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }


    //重写equals(..)方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || !(o instanceof Student))
            return false;
        Student student = (Student) o;
        return this.id == student.id && this.name.equals(student.name);

    }

}