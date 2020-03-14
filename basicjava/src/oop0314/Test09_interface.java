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
/*  ����. Ŭ�������� ����� ���� ��Ӹ� �����ϴ�
class Test extends Unit, School{}
*/

//�������̽��鰣�� ��� -> ���߻���� �����ϴ�
interface Fightable extends Movable, Attackable{}

class Fight extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
	
	}	
}
//Ŭ���� ���忡�� �θ� Ŭ������ ���ϻ�Ӹ� �����ϰ�
//			   �θ� �������̽��̸� ���߱����� �����ϴ�

class Human extends Unit
		    implements Movable, Attackable{

	@Override
	public void attack(Unit u) {}

	@Override
	public void move(int x, int y) {}
	
}

public class Test09_interface {

	public static void main(String[] args) {
		//Ŭ������ �������̽��� ���

	}

}
