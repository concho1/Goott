package volume;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. TV // 2. Audio // 3. Computer");
            System.out.println("위 메뉴중 하나를 선택하세요. ");
            int menu = sc.nextInt();
            if(menu >= 4) break;
            System.out.println("1. 볼륨 Up // 2. 볼륨 down");
            int volume = sc.nextInt();

            switch(menu){
                case 1:
                    if(volume == 1){
                        tv.up();
                    }else{
                        tv.down();
                    }
                    break;
                case 2:
                    if(volume == 1){
                        audio.up();
                    }else{
                        audio.down();
                    }
                    break;
                case 3:
                    if(volume == 1){
                        computer.up();
                    }else{
                        computer.down();
                    }
                    break;

            }
        }
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("TV의 볼륨은 " + tv.get() + "입니다.");
        System.out.println("Audio의 볼륨은 " + audio.get() + "입니다.");
        System.out.println("Computer의 볼륨은 " + computer.get() + "입니다.");
    }
}
