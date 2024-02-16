package polymorphism;

public class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("멍멍~");
    }
}
