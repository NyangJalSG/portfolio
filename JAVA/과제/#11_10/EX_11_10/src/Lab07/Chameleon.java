package Lab07;

public class Chameleon extends Reptile implements Animals {
	
	static int num;
	
	
	Chameleon(){
		this.feet= 4;
		this.life=3;
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
		System.out.println("ī�᷹���� ���� ���̸� ����");		

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("ī�᷹���� 4���� �ٸ��� �޸�");
	}

	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("ī�᷹�� �Դϴ�");
	}
}
