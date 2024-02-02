package Ch07_class;
/*
*
* * [문제2]
 * tv 객체를 만들되 tv1라는 참조변수를 이용하여
 * 객체를 만들과 아래와 같이 조건에 맞게 실행해 보세요.
 * 조건1) 색상:흰색, 전원:off, 채널:15
 * 조건2) tv2 정보를 화면에 출력해 보세요.
 * => display()메서드 이용
 * 조건3) tv2 정보를 다음과 같이 변경하여 화면에 보여주세요
 *  색상:흰색, 전원:on, 채널: 28
 *
* [문제2]
* tv 객체를 만들되 tv2라는 참조변수를 이용하여
* 객체를 만들과 아래와 같이 조건에 맞게 실행해 보세요.
* 조건1) 색상:흰색, 전원:off, 채널:32
* 조건2) tv2 정보를 화면에 출력해 보세요.
* => display()메서드 이용
* 조건3) tv2 정보를 다음과 같이 변경하여 화면에 보여주세요
*  색상:검정색, 전원:on, 채널: 11
 */
public class Tv {
    String color;
    boolean onOff;
    int ch;

    Tv(String color, boolean onOff, int ch){
        this.color = color;
        this.onOff = onOff;
        this.ch = ch;
    }

    void rePlace(String color, boolean onOff, int ch){
        this.color = color;
        this.onOff = onOff;
        this.ch = ch;
    }
    void chUp(){
        this.ch++;
    }
    void chDown(){
        this.ch--;
    }

    void display() {
        System.out.printf("TV의  색상: %s, 전원 : %b, 채널 : %d\n", this.color, this.onOff, this.ch);
    }
}
