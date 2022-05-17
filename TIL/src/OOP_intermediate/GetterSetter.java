package OOP_intermediate;

public class GetterSetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("나학생");
        s.setAge(17);

        String name = s.getName();
        int age = s.getAge();
        System.out.println(age + "살 " + name + "입니다.");
    }
}
class Student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
