package Lab07;

public abstract class Mammal extends Animal  implements Animals {


	@Override
	public void Eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub

	}

	static int num; 
	int teeth;
	
	Mammal(){
		this.num++;
	}

	@Override
	public void Death() {
		// TODO Auto-generated method stub
		super.Death();
		this.num--;
	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("포유류 입니다");
	}
}
