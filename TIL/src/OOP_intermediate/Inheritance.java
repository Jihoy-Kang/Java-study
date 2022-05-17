package OOP_intermediate;

public class Inheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "나선생";
        t.age = 24;
        t.eating();
        t.sleeping();
        System.out.println(t.name);

        MathTeacher mt = new MathTeacher();
        mt.name = "나수학";
        mt.age  = 30;
        mt.major = "수학";
        mt.eating();
        mt.teachingMath();
        System.out.println(mt.name);
    }
}

class Teacher {
    String name;
    int age;

    void eating(){
        System.out.println("식사를 해요");
    }
    void sleeping(){
        System.out.println("잠을 자요");
    }
}

class MathTeacher extends Teacher {
    String school;
    String major;
    void teachingMath(){
        System.out.println("수학을 가르쳐요");
    }
}
class EnglishTeacher extends Teacher { // Teacher 클래스로부터 필드와 메서드 상속 받기 위해서 extends 활용
    String school;
    String major;
    void teachingEnglish(){
        System.out.println("영어를 가르쳐요");
    }
}