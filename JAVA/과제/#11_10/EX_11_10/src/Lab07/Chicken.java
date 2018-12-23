package Lab07;

public class Chicken extends Bird implements Animals {
static int num;
	
	Chicken(){
		this.feet= 2;
		this.life=6;
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
		System.out.println("¥ﬂ¿∫ ∫Œ∏Æ∑Œ ∏‘¿Ã∏¶ ∏‘¿Ω");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("¥ﬂ¿∫ 2∞≥¿« ¥Ÿ∏Æ∑Œ ¥ﬁ∏≤");
	}
	void PrintInfo(int year) {
		super.PrintInfo(year);
		System.out.println("¥ﬂ ¿‘¥œ¥Ÿ");		
	}
}
