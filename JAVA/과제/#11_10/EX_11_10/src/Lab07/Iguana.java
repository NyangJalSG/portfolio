package Lab07;

public class Iguana extends Reptile implements Animals {


	static int num;
	
	Iguana(){
		this.feet= 4;
		this.life=15;
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
		System.out.println("�̱��Ƴ��� ���� ���̸� ����");

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub

		System.out.println("�̱��Ƴ��� 4���� �ٸ��� �޸�");
	}

	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("�̱��Ƴ� �Դϴ�");
	}
}
