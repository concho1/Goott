package animal;

public class Animal {
    String name;
    Animal(){}
    Animal(String name){
        this.name = name;
    }
    void sound(){
        System.out.println("울음소리 ~");
    }
}
