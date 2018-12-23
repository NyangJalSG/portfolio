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
		System.out.println("카멜레온은 혀로 먹이를 잡음");		

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("카멜레온은 4개의 다리로 달림");
	}

	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("카멜레온 입니다");
	}
}
