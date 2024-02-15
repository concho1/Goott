package hw1;

public class Temporary extends Employee {
    int time;
    int pay;
    Temporary(){
        super();
    }
    Temporary(String name, int time, int pay){
        super(name);
        this.time = time;
        this.pay = pay;
    }
    @Override
    int getPays(){
        return this.time * this.pay;
    }
}
