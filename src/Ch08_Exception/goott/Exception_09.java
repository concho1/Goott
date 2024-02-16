package Ch08_Exception.goott;
/*
    throws 키워드
    예외 처리를 위임시키는 명령어
    형식) 메서드명 throws 예외처리클래스{}
    - throws 로 지정된 메서드를 호출하는 경우
    메서드 내에서 예외가 발생하면 해당 예외를 메서드를 호출한 곳으로 위임기켜서 예외를 처리하는 방법
 */
public class Exception_09 {
    static void ex() throws Exception{
        int a = 10/0;
    }

    public static void main(String[] args){
        try {
            ex();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
