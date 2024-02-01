package hw;
import java.util.*;

class Student{
    String name;
    int id;
    String department;
    String phoneNum;
    Student(){}
    Student(String name, int id, String department, String phoneNum){
        this.name = name;
        this.id = id;
        this.department = department;
        this.phoneNum = phoneNum;
    }
}
class StudentTable{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Student> map = new HashMap<>();
    int createId = 24000, stCnt = 1;
    
    static void removeConsol(){
        for(int i =0; i<30; i++) System.out.println();
    }
    void add(){
        removeConsol();
        while(true){
            try {
                System.out.printf("\n등록할 %2d번째 학생의 \n이름, 학과, 전화번호를 순서대로 입력하세요 : ",this.stCnt);
                String input = sc.nextLine();
                System.out.print(input);
                input = input.replaceAll(" ","");
                input = input.trim();
                String[] arr = input.split(",");

                Student s = new Student(arr[0], ++this.createId, arr[1],arr[2]);
                int tm = this.createId;
                this.map.put(tm, s);
                this.stCnt++;
                break;

            }catch (Exception e){
                System.out.println("\n예외 발생, 다시 입력해주세요.");
                sc.nextLine();
            }


        }
        removeConsol();
        System.out.println("등록을 완료하였습니다. ");
    }

    void printAll(){
        removeConsol();
        while(true) {
            try {
                System.out.println("\n*****************학생 정보*****************");
                for(int i : map.keySet()){
                    Student st = map.get(i);
                    System.out.printf("학번: %d    이름: %s    학과: %s    전화번호: %s\n", st.id, st.name, st.department, st.phoneNum);
                }
                System.out.println("\n*****************************************\n");

                break;
            } catch (Exception e) {
                System.out.println("다시 입력하세요...\n");
                sc.nextLine();
            }
        }

    }

    void print(){
        removeConsol();
        while(true) {
            try {
                System.out.print("조회할 학생의 학번을 입력하시오. : ");
                int id = sc.nextInt();
                Student st = map.get(id);
                System.out.printf("학번: %d    이름: %s    학과: %s    전화번호: %s\n", st.id, st.name, st.department, st.phoneNum);

                break;
            } catch (Exception e) {
                System.out.println("다시 입력하세요...\n");
                sc.nextLine();
            }
        }

    }
    void rePlace() {
        removeConsol();
        while(true) {
            try {
                System.out.print("수정할 학생의 학번을 입력하시오. : ");
                int id = sc.nextInt();
                Student st = map.get(id);
                System.out.printf("%s 학생의 기존 학과: %s, 전화번호: %s\n",st.name, st.department, st.phoneNum);
                System.out.print("수정할 학과를 입력하세요 : ");
                String newDepartment = sc.next();
                System.out.print("수정할 전화번호를 입력하세요 : ");
                String newPhoneNum = sc.next();

                st.department = newDepartment;
                st.phoneNum = newPhoneNum;
                System.out.println("수정이 완료되었습니다.");

                break;
            } catch (Exception e) {
                System.out.println("다시 입력하세요...\n");
                sc.nextLine();
            }
        }

    }

    boolean exit(){
        removeConsol();
        System.out.println("프로그램을 종료하시겠습니까?(y/n");
        String answer = sc.next();
        return answer.equals("y");
    }
}

public class Hw_04 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentTable stTable = new StudentTable();

        while(true){
            while(true) {
                try {
                    int command = 0;
                    System.out.println("**************메뉴 구성**************");
                    System.out.println("1. 학생등록");
                    System.out.println("2. 전체출력");
                    System.out.println("3. 학생조회");
                    System.out.println("4. 정보수정");
                    System.out.println("5. 프로그램 종료");
                    System.out.println("\nex) 1 입력\n사용할 메뉴를 선택하세요. : ");
                    command = sc.nextInt();
                    switch (command){
                        case 1: {
                            stTable.add();
                            break;
                        }
                        case 2: {
                            stTable.printAll();
                            break;
                        }
                        case 3: {
                            stTable.print();
                            break;
                        }
                        case 4: {
                            stTable.rePlace();
                            break;
                        }
                        case 5: {
                            if(stTable.exit()) {
                                System.out.println("프로그램을 종료합니다....");
                                System.exit(1);
                            }
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("다시 입력하세요...\n");
                    sc.nextLine();
                }
            }

        }
    }

}
