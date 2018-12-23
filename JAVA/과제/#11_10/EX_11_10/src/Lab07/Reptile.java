package Lab07;

public abstract class Reptile extends Animal implements Animals {

	static int num;
	
	
	
	Reptile(){
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
		System.out.println("파충류 입니다");
	}
	
}
