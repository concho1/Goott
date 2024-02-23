package file;
/*
    프로세스?
    - 현제 CPU에서 처리되고 있는 프로그램
    - 운영체제로 부터 메모리를 할당을 받음.
    - 자바에서는 하나의 클래스를 말함
 */
class Process01{
    void go(){
        int i = 1;
        while(true){
            System.out.println("p1 >>> "+ i);
        }
    }
}

class Process02{
    void go(){
        int i = 1;
        while(true){
            System.out.println("p2 >>> "+ i);
        }
    }
}

class Tread01 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("t111111111 >>> "+ i);
        }
    }
}

class Tread02 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println("t222 >>> "+ i);
        }
    }
}
public class Ch12_Tread {
    public static void main(String[] args) {
        Process01 p1 = new Process01();
        Process02 p2 = new Process02();
        Tread01 t1 = new Tread01();
        Tread02 t2 = new Tread02();

        t1.start();
        t2.start();
    }
}
