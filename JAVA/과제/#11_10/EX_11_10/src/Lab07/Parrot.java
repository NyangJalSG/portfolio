package Lab07;

public class Parrot extends Bird implements Animals {



	static int num;
	
	Parrot(){
		this.feet= 2;
		this.life=20;
		this.wing =2;
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
		System.out.println("앵무새는 부리로 먹이를 먹음");

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("앵무새는 2개의 다리로 달림");

	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("앵무새 입니다");
		
	}

}
