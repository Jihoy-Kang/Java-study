package OOP_intermediate;

public class Polymorphism2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyStuff(new Bab());
    }
}

class Stuff{
    int price;
    public Stuff(int price){
        this.price = price;
    }
}

class Bab extends Stuff{
    public Bab(){
        super(1500);
    }
    public String toString(){
        return  "Bab";
    }
}

class Ramyen extends Stuff{
    public Ramyen(){
        super(1000);
    }
}

class Customer{
    int money = 10000;
    void buyStuff(Stuff stuff){
        System.out.println(stuff +"를 구매하였습니다.");
        System.out.println("잔액은 "+ stuff.price +"입니다.");
    }
}
