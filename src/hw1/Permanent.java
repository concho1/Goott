package hw1;

public class Permanent extends Employee {
    int pay;
    int bonus;
    Permanent(){
        super();
    }
    Permanent(String name, int bonus, int pay){
        super(name);
        this.bonus = bonus;
        this.pay = pay;
    }
    @Override
    int getPays(){
        return this.pay + this.bonus;
    }
}
