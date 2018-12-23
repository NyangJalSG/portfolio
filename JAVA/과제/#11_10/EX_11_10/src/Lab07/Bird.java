package Lab07;

public abstract class Bird extends Animal implements Animals {

	static int num;
	int wing;
	
	Bird(){
		this.num++;
	}
	
	@Override
	public void Death() {
		// TODO Auto-generated method stub
		super.Death();
		this.num--;
	}
	void PrintInfo(int year)  {
		super.PrintInfo(year);
		System.out.println("조류 입니다");
	}
}
