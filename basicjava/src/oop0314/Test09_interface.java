package oop0314;

class Unit{
	int currentHP;
	int x, y;
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}
/*  에러. 클래스간의 상속은 단일 상속만 가능하다
class Test extends Unit, School{}
*/

//인터페이스들간의 상속 -> 다중상속이 가능하다
interface Fightable extends Movable, Attackable{}

class Fight extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
	
	}	
}
//클래스 입장에서 부모가 클래스면 당일상속만 가능하고
//			   부모가 인터페이스이면 다중구현이 가능하다

class Human extends Unit
		    implements Movable, Attackable{

	@Override
	public void attack(Unit u) {}

	@Override
	public void move(int x, int y) {}
	
}

public class Test09_interface {

	public static void main(String[] args) {
		//클래스와 인터페이스의 상속

	}

}
