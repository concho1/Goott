package polymorphism;
/*
    다형성(polymorphism)?
    객체지향 프로그램의 4대 특징 중 하나.
    상속과 연관성이 많음
    - 다형성은 사전적 의미
    ==> 같은 종의 생물이지만 모습이나 특징이 고유의 성질을 가지고 있는 것을 말함.
    여러가지 형태로 해석될 수 있음
    하나의 객체를 다양한 형태로 선언하고 이를 사용할 수 있음
    단 부모 interface에서 상속을 받은 멤버에만 접근할 수 있음
 */
public interface Animal {
    void bark();

    default void sound(){
        System.out.println("오버라이딩 귀찮아서 만든 interface에 생성한 defalt메서드");
    }

}
