package OOP_intermediate;

public class Composite {
    int no;
    String name;
    Education education;
    public Composite(int no, String name, Education education){
        this.no = no;
        this.name = name;
        this.education = education;
    }
    void show(){
        System.out.println(no+"번 "+name + "입니다. " + education.school + education.major + "학과를 졸업했습니다.");
    }
    public static void main(String[] args) {
        Education education = new Education("서울대"," 화확");
        Composite student = new Composite(1,"나학생",education);

        student.show();
    }
}
class Education{
    String school, major;
    Education(String school, String major){
        this.school = school;
        this.major = major;
    }
}