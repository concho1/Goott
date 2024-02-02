package hw;
import  java.util.*;
public class Hw_04tm {
    static Scanner sc = new Scanner(System.in);
    static int idCnt = 0;
    static void ac1(String[] names, int[] id, String[] cl, String[] phNum){
        System.out.println("학생 이름 :");
        names[idCnt] = sc.next();
        System.out.println("학생 학번 :");
        id[idCnt] = sc.nextInt();
        System.out.println("학생 학과 :");
        cl[idCnt] = sc.next();
        System.out.println("학생 전화번호 :");
        phNum[idCnt] = sc.next();

        // 다음 배열 index에 저장해주기 위해
        idCnt++;
    }
    static void ac2(String[] names, int[] id, String[] cl, String[] phNum){
        System.out.println("***********************전체 출력***********************");
        for(int i =0; i< idCnt; i++){
            System.out.println(" 이름 : " + names[i] + " 학번 : " + id[i] + " 과 : " + cl[i] + " 번호 : " + phNum[i]);
        }
        System.out.println("*****************************************************");
    }
    static void ac3(String[] names, int[] id, String[] cl, String[] phNum){
        System.out.println("찾을 사람의 학번 입력 :");
        int inputId = sc.nextInt();
        // 배열 순차 탐색
        for(int i =0; i< idCnt; i++){
            // 저장된 학번이 입력된 학번(id)와 같으면 출력
            if(id[i] == inputId){
                System.out.println(" 이름 : " + names[i] + " 학번 : " + id[i] + " 과 : " + cl[i] + " 번호 : " + phNum[i]);
            }
        }
    }
    static void ac4(String[] names, int[] id, String[] cl, String[] phNum){
        System.out.println("수정할 사람의 학번 입력 :");
        int inputId = sc.nextInt();
        // 배열 순차 탐색
        for(int i =0; i< idCnt; i++){
            // 저장된 학번이 입력된 학번(id)와 같으면 수정
            if(id[i] == inputId){
                System.out.print("수정할 학과를 입력하세요 : ");
                cl[i] = sc.next(); //학번 수정
                System.out.print("수정할 전화번호를 입력하세요 : ");
                phNum[i] = sc.next(); //전화번호 수정
            }
        }
    }
    static void ac5(){
        System.out.println("프로그램을 종료하려면 y를 입력하세요.");
        // 입력받은게 y이면 프로그램 종료
        if(sc.next().equals("y")){
            System.out.println("프로그램을 종료합니다 ....");
            System.exit(1);
        }
    }

    public static void main(String[] args) {

        System.out.println("전체 학생수를 입력하세요");
        int stNum = sc.nextInt();

        String[] names = new String[stNum];
        int[]    id    = new int[stNum];
        String[] cl    = new String[stNum];
        String[] phNum = new String[stNum];

        while(true){
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("1. 학생등록");
            System.out.println("2. 전체출력");
            System.out.println("3. 학생조회");
            System.out.println("4. 정보수정");
            System.out.println("5. 프로그램 종료");

            System.out.println("커맨드를 입력하세요.");
            int c = sc.nextInt();
            switch(c){
                case 1: {
                    ac1(names, id, cl, phNum);
                    break;
                }
                case 2:{
                    ac2(names, id, cl, phNum);
                    break;
                }
                case 3:{
                    ac3(names, id, cl, phNum);
                    break;
                }
                case 4:{
                    ac4(names, id, cl, phNum);
                    break;
                }
                case 5:{
                    ac5();
                    break;
                }
            }
        }
    }
}
