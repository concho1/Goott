package polymorphism;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static void wichAnimal(Animal animal){
        animal.bark();
    }
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.bark();
        dog.bark();
        dog.sound();
        wichAnimal(cat);
        String str = """
                     오 이게 된다고?
                     대박
                     """;
        System.out.println(str);
        String[] strArr = {"abc", "abcd", "abcde"};
        List<String> strList =  Stream.of(strArr).toList();
        Some s = new Some();
        s.somthing = new MyClassIm();
    }
}
