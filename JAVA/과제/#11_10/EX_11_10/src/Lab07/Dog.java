package Lab07;

public class Dog extends Mammal implements Animals {
static int num;
	
	Dog(){
		this.num++;
		this.feet=4;
		this.teeth=42;
		this.life=10;
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
		System.out.println("개는 입으로 먹이를 먹음");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("개는 4개의 다리로 달림");
	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("개 입니다");
		
	}

}
