package OOP_intermediate;

// composite
public class Inheritance2 {
    int no;
    String name;
    Address address;

    public Inheritance2(int no,String name, Address address){
        this.no = no;
        this.name = name;
        this.address = address;
    }

    void introduction(){
        System.out.println(no + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("제주","한국");
        Address address2 = new Address("뉴욕", "미국");

        Inheritance2 t1 = new Inheritance2(1, "나제주", address1);
        Inheritance2 t2 = new Inheritance2(2, "나뉴욕", address2);

        t1.introduction();
        t2.introduction();
    }
}

class Address{
    String city, country;
    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }
}

