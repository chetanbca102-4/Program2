public class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Student Age: " + age + ", Student DOB: " + DOB);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Lalu", 20, "03-02-2005");
        s1.display();
    }
}
