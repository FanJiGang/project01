package cn.tedu.demo01;

public class test{

    private String s;

    static{
        System.out.println("test的静态代码块");
    }

    {
        System.out.println("test的代码块");
    }

    public test() {
        System.out.println("test的无参构造");
    }

    public test(String s) {
        System.out.println("test的有参构造");
        this.s = s;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("fan", 25, "tashan");

    }
}

class Student {
    private String name;
    private Integer age;
    private String School;

    static {
        System.out.println("Student的静态代码块");
    }

    {
        for (int i = 0; i < 3; i++) {
            System.out.println("Student的代码块");
        }
    }

    public Student() {
        System.out.println("student的无参构造");
    }

    public Student(String name, Integer age, String school) {
        System.out.println("student的有参构造");
        this.name = name;
        this.age = age;
        School = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", School='" + School + '\'' +
                '}';
    }
}
