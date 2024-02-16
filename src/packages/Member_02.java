package packages;
import model.*;
import java.util.*;
/*
    회원 수를 키보드로 입력 받고, 회원 수만큼 회원의 정보를
    키보드로 입력을 받아서 객체 배열에 저장을 하고, 저장된 회원의 정보를 화면에 보여주세요.
    id, pwd, name, age, phone, addr
 */
public class Member_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var map = new HashMap<String, Member>();
        while(true){
            System.out.println("회원 정보를 입력하세요.\nex) \n아이디,   비밀번호,   이름,   나이,   폰번호,    주소");
            String input = sc.nextLine();
            input = input.replace(" ", "");
            String[] arr = input.split(",");
            Member m = new Member(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            map.put(m.getId(), m);
            System.out.println("종료하려먼 'e'를 눌러주세요");
            if(sc.nextLine().equals("e")) break;
        }
        String str = """
                     ====================================================================
                     아이디     주소        나이       이름        비밀번호        전화번호
                     """;
        System.out.println(str);

        for(String k : map.keySet()){
            Member m = map.get(k);
            System.out.printf("%-10s" ,m.getId());
            System.out.printf("%-10s" , m.getAddr());
            System.out.printf("%-10s" , m.getAge());
            System.out.printf("%-10s" , m.getName());
            System.out.printf("%-17s" , m.getPwd());
            System.out.printf("%-10s\n" , m.getPhone());
        }
    }
}
