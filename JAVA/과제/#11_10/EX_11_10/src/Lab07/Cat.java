package Lab07;

public class Cat extends Mammal implements Animals {
static int num;
	
	
	Cat(){
		this.feet = 4; 
		this.life = 15;
		this.teeth = 30;
		this.num++;
	}
	
	@Override
	public void Death() {
		// TODO Auto-generated method stub
		super.Death();
		this.num--;

	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		System.out.println("����̴� ������ ���̸� ����");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("����̴� 4���� �ٸ��� �޸�");
	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("����� �Դϴ�");
		
	}
}
