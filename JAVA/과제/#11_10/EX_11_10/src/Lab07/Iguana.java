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
		System.out.println("이구아나는 혀로 먹이를 잡음");

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub

		System.out.println("이구아나는 4개의 다리로 달림");
	}

	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("이구아나 입니다");
	}
}
