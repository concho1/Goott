package packages;
import model.*;
/*
    패키지
    - 서로 연관성이 있는 클래스들과 인터페이스들의 묶음
    - 폴더와 유사
    - 패키지는 서브 패키지를 가질 수 있으며 . 으로 구분함
    import 키워드는 다른 패키지의 클래스를 사용하고 싶은 경우 사용
    ex ==> import model.Member
 */
public class Package_01 {
    public static void main(String[] args) {
        Member member = new Member();
        member.setId("ches5151");
        String id = member.getId();

    }
}
