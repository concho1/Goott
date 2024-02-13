package animal;

public class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
