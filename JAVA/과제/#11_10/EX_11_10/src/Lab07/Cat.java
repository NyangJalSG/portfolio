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
		System.out.println("고양이는 입으로 먹이를 먹음");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 4개의 다리로 달림");
	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("고양이 입니다");
		
	}
}
