package Lab07;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass { // 다음부터 메인클래스에 코딩 5줄 넘기지 말기

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, LinkedList> hm = new HashMap<String, LinkedList>();
		LinkedList<Dog> doglist = new LinkedList<Dog>();
		LinkedList<Chicken> chickenlist = new LinkedList<Chicken>();
		LinkedList<Cat> catlist = new LinkedList<Cat>();
		LinkedList<Iguana> iguanalist = new LinkedList<Iguana>();
		LinkedList<Parrot> parrotlist = new LinkedList<Parrot>();
		LinkedList<Chameleon> chameleonlist = new LinkedList<Chameleon>();
		hm.put("개", doglist);
		hm.put("고양이", catlist);
		hm.put("앵무새", parrotlist);
		hm.put("닭", chickenlist);
		hm.put("이구아나", iguanalist);
		hm.put("카멜레온", chameleonlist);

		Scanner s = new Scanner(System.in);
		int year = 0;
		int random;
		int num = 0;
		int menu;
		boolean flag = false;
		while (flag == false) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 다음 연도로 진행");
			System.out.println("2. 동물의 개수 출력");
			System.out.println("3. 모든 동물의 먹기 호출");
			System.out.println("4. 모든 동물의 뛰기 호출");
			System.out.println("5. 모든 동물의 정보 출력");
			System.out.println("6. 특정 동물의 먹기 호출");
			System.out.println("7. 특정 동물의 뛰기 호출");
			System.out.println("8. 특정 동물의 정보 출력");
			System.out.println("9. 파일 저장");
			System.out.println("10.파일 불러오기");
			System.out.println("0. : 끝내기");
			menu = s.nextInt();
			if (menu == 1) {
				year++;
				System.out.println(year + "년째입니다");
				random = (int) (Math.random() * 6 + 1);
				if (random == 1) {
					doglist.add(new Dog());
					doglist.get(doglist.size() - 1).birth = year;
					num++;
					System.out.println("개 탄생");
				} else if (random == 2) {
					catlist.add(new Cat());
					catlist.get(catlist.size() - 1).birth = year;
					num++;
					System.out.println("고양이 탄생");
				} else if (random == 3) {
					parrotlist.add(new Parrot());
					parrotlist.get(parrotlist.size() - 1).birth = year;
					num++;
					System.out.println("앵무새 탄생");
				} else if (random == 4) {
					chickenlist.add(new Chicken());
					chickenlist.get(chickenlist.size() - 1).birth = year;
					num++;
					System.out.println("닭 탄생");
				} else if (random == 5) {
					iguanalist.add(new Iguana());
					iguanalist.get(iguanalist.size() - 1).birth = year;
					num++;
					System.out.println("이구아나 탄생");
				} else if (random == 6) {
					chameleonlist.add(new Chameleon());
					chameleonlist.get(chameleonlist.size() - 1).birth = year;
					num++;
					System.out.println("카멜레온 탄생");
				}
				// 사망처리
				for (int i = 0; i < doglist.size(); i++) {
					if (doglist.get(i).life - (year - doglist.get(i).birth) <= 0) {
						doglist.get(i).Death();
						doglist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("개 사망");
					}
				}
				for (int i = 0; i < catlist.size(); i++) {
					if (catlist.get(i).life - (year - catlist.get(i).birth) <= 0) {
						catlist.get(i).Death();
						catlist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("고양이 사망");
					}
				}
				for (int i = 0; i < parrotlist.size(); i++) {
					if (parrotlist.get(i).life
							- (year - parrotlist.get(i).birth) <= 0) {
						parrotlist.get(i).Death();
						parrotlist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("앵무새 사망");
					}
				}
				for (int i = 0; i < chickenlist.size(); i++) {
					if (chickenlist.get(i).life
							- (year - chickenlist.get(i).birth) <= 0) {
						chickenlist.get(i).Death();
						chickenlist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("닭 사망");
					}
				}
				for (int i = 0; i < iguanalist.size(); i++) {
					if (iguanalist.get(i).life
							- (year - iguanalist.get(i).birth) <= 0) {
						iguanalist.get(i).Death();
						iguanalist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("이구아나 사망");
					}
				}
				for (int i = 0; i < chameleonlist.size(); i++) {
					if (chameleonlist.get(i).life
							- (year - chameleonlist.get(i).birth) <= 0) {
						chameleonlist.get(i).Death();
						chameleonlist.remove(i); // 아예 리스트에서 제거 죽은 동물들이 안뜸
						System.out.println("카멜레온 사망");
					}
				}

			} else if (menu == 2) {
				System.out.println("총 " + Animal.num + "마리");
				System.out.println("포유류 " + Mammal.num + "마리");
				System.out.println("조류 " + Bird.num + "마리");
				System.out.println("파충류 " + Reptile.num + "마리");
				System.out.println("개 " + Dog.num + "마리");
				System.out.println("고양이 " + Cat.num + "마리");
				System.out.println("앵무새 " + Parrot.num + "마리");
				System.out.println("닭 " + Chicken.num + "마리");
				System.out.println("이구아나 " + Iguana.num + "마리");
				System.out.println("카멜레온 " + Chameleon.num + "마리");
			} else if (menu == 3) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "개") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).Eat();
						}
					} else if (key == "고양이") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).Eat();
						}
					} else if (key == "앵무새") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).Eat();
						}
					} else if (key == "닭") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).Eat();
						}
					} else if (key == "이구아나") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).Eat();
						}
					} else if (key == "카멜레온") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).Eat();
						}
					}
				}
			} else if (menu == 4) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "개") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).Run();
						}
					} else if (key == "고양이") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).Run();
						}
					} else if (key == "앵무새") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).Run();
						}
					} else if (key == "닭") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).Run();
						}
					} else if (key == "이구아나") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).Run();
						}
					} else if (key == "카멜레온") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).Run();
						}
					}
				}

			} else if (menu == 5) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "개") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).PrintInfo(year);
						}
					} else if (key == "고양이") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).PrintInfo(year);
						}
					} else if (key == "앵무새") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).PrintInfo(year);
						}
					} else if (key == "닭") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).PrintInfo(year);
						}
					} else if (key == "이구아나") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).PrintInfo(year);
						}
					} else if (key == "카멜레온") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).PrintInfo(year);
						}
					}
				}

			} else if (menu == 6) {
				System.out.println("어떤 동물을 먹기를 출력");
				String what = s.next();
				if (what.equals("개")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).Eat();
					}
				} else if (what.equals("고양이")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).Eat();
						;
					}
				} else if (what.equals("앵무새")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).Eat();
					}
				} else if (what.equals("닭")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).Eat();
						;
					}
				} else if (what.equals("이구아나")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).Eat();
					}
				} else if (what.equals("카멜레온")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).Eat();
					}
				} else {
					System.out.println("없는 동물입니다");
				}
			} else if (menu == 7) {
				System.out.println("어떤 동물을 뛰기를 출력");
				String what = s.next();
				if (what.equals("개")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).Run();
					}
				} else if (what.equals("고양이")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).Run();
					}
				} else if (what.equals("앵무새")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).Run();
					}
				} else if (what.equals("닭")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).Run();
					}
				} else if (what.equals("이구아나")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).Run();
					}
				} else if (what.equals("카멜레온")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).Run();
					}
				} else {
					System.out.println("없는 동물입니다");
				}

			} else if (menu == 8) {
				System.out.println("어떤 동물을 정보출력");
				String what = s.next();
				if (what.equals("개")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).PrintInfo(year);
					}
				} else if (what.equals("고양이")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("앵무새")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("닭")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("이구아나")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).PrintInfo(year);
					}
				} else if (what.equals("카멜레온")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).PrintInfo(year);
					}
				} else {
					System.out.println("없는 동물입니다");
				}
			} else if (menu == 9) {

				try {
					FileWriter fwriter = new FileWriter("./src/Lab07/save.txt");
					BufferedWriter bwriter = new BufferedWriter(fwriter);
					Iterator<String> keys = hm.keySet().iterator();
					while (keys.hasNext()) {
						String key = keys.next();
						if (key == "개") {
							for (int i = 0; i < doglist.size(); i++) {
								fwriter.write("포유류#개#");
								fwriter.write(doglist.get(i).birth + "#");
								fwriter.write(doglist.get(i).life + "#");
								fwriter.write(doglist.get(i).feet + "#");
								fwriter.write(doglist.get(i).teeth + "#");
							}
						} else if (key == "고양이") {
							for (int i = 0; i < catlist.size(); i++) {
								fwriter.write("포유류#고양이#");
								fwriter.write(catlist.get(i).birth + "#");
								fwriter.write(catlist.get(i).life + "#");
								fwriter.write(catlist.get(i).feet + "#");
								fwriter.write(catlist.get(i).teeth + "#");
							}
						} else if (key == "앵무새") {
							for (int i = 0; i < parrotlist.size(); i++) {
								fwriter.write("조류#앵무새#");
								fwriter.write(parrotlist.get(i).birth + "#");
								fwriter.write(parrotlist.get(i).life + "#");
								fwriter.write(parrotlist.get(i).feet + "#");
								fwriter.write(parrotlist.get(i).wing + "#");
							}
						} else if (key == "닭") {
							for (int i = 0; i < chickenlist.size(); i++) {
								fwriter.write("조류#닭#");
								fwriter.write(chickenlist.get(i).birth + "#");
								fwriter.write(chickenlist.get(i).life + "#");
								fwriter.write(chickenlist.get(i).feet + "#");
								fwriter.write(chickenlist.get(i).wing + "#");
							}
						} else if (key == "이구아나") {
							for (int i = 0; i < iguanalist.size(); i++) {
								fwriter.write("파충류#이구아나#");
								fwriter.write(iguanalist.get(i).birth + "#");
								fwriter.write(iguanalist.get(i).life + "#");
								fwriter.write(iguanalist.get(i).feet + "#");
							}
						} else if (key == "카멜레온") {
							for (int i = 0; i < chameleonlist.size(); i++) {
								fwriter.write("파충류#카멜레온#");
								fwriter.write(chameleonlist.get(i).birth + "#");
								fwriter.write(chameleonlist.get(i).life + "#");
								fwriter.write(chameleonlist.get(i).feet + "#");
							}
						}

					}

					fwriter.close();
					bwriter.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			else if (menu == 10) {
				// 일단 몰살
				int dogsize = doglist.size();
				int catsize = catlist.size();
				int parrotsize = parrotlist.size();
				int chickensize = chickenlist.size();
				int iguanasize = iguanalist.size();
				int chameleonsize = chameleonlist.size();
				for (int i = 0; i < doglist.size(); i++) {
					doglist.get(i).Death();
				}
				doglist.clear();
				
				for (int i = 0; i < catlist.size(); i++) {
					catlist.get(i).Death();
				}
				catlist.clear();
				for (int i = 0; i < parrotlist.size(); i++) {
					parrotlist.get(i).Death();					
				}
				parrotlist.clear();
				for (int i = 0; i < chickenlist.size(); i++) {
					chickenlist.get(i).Death();
				}
				chickenlist.clear();
				for (int i = 0; i < iguanalist.size(); i++) {
					iguanalist.get(i).Death();
				}
				iguanalist.clear();
				for (int i = 0; i < chameleonlist.size(); i++) {
					chameleonlist.get(i).Death();
				}
				chameleonlist.clear();
				
				year = 0;

				int i = 0;
				byte[] buf = new byte[1024];
				int ch;
				int saveyear;
				int k = 0;
				try {
					FileInputStream fis = new FileInputStream(
							"./src/Lab07/save.txt");
					while ((ch = fis.read()) != -1) {
						buf[i++] = (byte) ch;
					}
					StringBuffer sb = new StringBuffer();
					StringTokenizer st = new StringTokenizer(new String(buf),
							"#");
					while (st.hasMoreTokens()) {
						sb.append(st.nextToken());
						if (sb.toString().equals("포유류개")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							doglist.add(new Dog());
							doglist.get(doglist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("포유류고양이")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							catlist.add(new Cat());
							catlist.get(catlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("조류앵무새")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							parrotlist.add(new Parrot());
							parrotlist.get(parrotlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("조류닭")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							chickenlist.add(new Chicken());
							chickenlist.get(chickenlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("파충류이구아나")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 2; j++) {
								st.nextToken();
							}
							iguanalist.add(new Iguana());
							iguanalist.get(iguanalist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("파충류카멜레온")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 2; j++) {
								st.nextToken();
							}
							chameleonlist.add(new Chameleon());
							chameleonlist.get(chameleonlist.size() - 1).birth = saveyear;
						}
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			else if (menu == 0) {
				return;
			} else
				;
		}
	}

}
