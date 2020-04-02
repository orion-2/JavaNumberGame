package intF;

public interface Missile {
	public int attack();
	//선언만 만든 이유는 missile 참조변수로 구현받은
	//클래스(객체-인스턴스)에 모두 접근가능 >> 자바의 다형성을 활용
	public void moveAction();
}
