package OOP2;


//캡슐화로인해 보호되는 정보에 접근하는 방법

public class GetterSetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("나공부");
        s.setAge(17);

        String name = s.getName();
        System.out.println("학생이름 :" + name);
        int age = s.getAge();
        System.out.println("나이 :" + age);
    }
}

class Student{
    private String name; //private으로 외부 접근 불가
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}