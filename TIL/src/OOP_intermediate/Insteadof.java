package OOP_intermediate;



public class Insteadof {
    public static void main(String[] args) {
        Cities city = new Cities();
        System.out.println(city instanceof Object); //true
        System.out.println(city instanceof Cities); //true
        System.out.println(city instanceof Seoul); //false
        System.out.println(city instanceof Busan); //false

        Cities seoul = new Seoul();
        System.out.println(seoul instanceof Object); //true
        System.out.println(seoul instanceof Cities); //true
        System.out.println(seoul instanceof Seoul);  //true
        System.out.println(seoul instanceof Busan); //false

        Busan busan = new Busan();
        Cities busan2 = (Cities) busan;
        System.out.println(busan2 instanceof Object); //true
        System.out.println(busan2 instanceof Cities); //true
        System.out.println(busan2 instanceof Seoul);  //false
        System.out.println(busan2 instanceof Busan); //true


    }
}

class Cities{}
class Seoul extends Cities{}
class Busan extends Cities{}
