package animal;

public class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
