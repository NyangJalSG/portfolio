package Lab07;

public abstract class Animal implements Animals {

	int feet;
	int birth;
	int life;
	static int num;
	
	Animal(){
		this.num++;
	}
	
	@Override
	public void Death() {
		// TODO Auto-generated method stub
		this.num--;
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		
	}

	void PrintInfo(int year) {
		System.out.println("�¾ �� : " + birth + "�⵵");
		System.out.println(" ���� :  " + life); 
		System.out.println("���� ���� : " + (life-(year-birth)));
		
	}
}
