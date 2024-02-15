package hw1;

public abstract class Employee {
    String name;
    Employee(){}
    Employee(String name){
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    int getPays(){
        return 0;
    }

}
