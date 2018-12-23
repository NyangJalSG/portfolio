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

public class MainClass { // �������� ����Ŭ������ �ڵ� 5�� �ѱ��� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, LinkedList> hm = new HashMap<String, LinkedList>();
		LinkedList<Dog> doglist = new LinkedList<Dog>();
		LinkedList<Chicken> chickenlist = new LinkedList<Chicken>();
		LinkedList<Cat> catlist = new LinkedList<Cat>();
		LinkedList<Iguana> iguanalist = new LinkedList<Iguana>();
		LinkedList<Parrot> parrotlist = new LinkedList<Parrot>();
		LinkedList<Chameleon> chameleonlist = new LinkedList<Chameleon>();
		hm.put("��", doglist);
		hm.put("�����", catlist);
		hm.put("�޹���", parrotlist);
		hm.put("��", chickenlist);
		hm.put("�̱��Ƴ�", iguanalist);
		hm.put("ī�᷹��", chameleonlist);

		Scanner s = new Scanner(System.in);
		int year = 0;
		int random;
		int num = 0;
		int menu;
		boolean flag = false;
		while (flag == false) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. ���� ������ ����");
			System.out.println("2. ������ ���� ���");
			System.out.println("3. ��� ������ �Ա� ȣ��");
			System.out.println("4. ��� ������ �ٱ� ȣ��");
			System.out.println("5. ��� ������ ���� ���");
			System.out.println("6. Ư�� ������ �Ա� ȣ��");
			System.out.println("7. Ư�� ������ �ٱ� ȣ��");
			System.out.println("8. Ư�� ������ ���� ���");
			System.out.println("9. ���� ����");
			System.out.println("10.���� �ҷ�����");
			System.out.println("0. : ������");
			menu = s.nextInt();
			if (menu == 1) {
				year++;
				System.out.println(year + "��°�Դϴ�");
				random = (int) (Math.random() * 6 + 1);
				if (random == 1) {
					doglist.add(new Dog());
					doglist.get(doglist.size() - 1).birth = year;
					num++;
					System.out.println("�� ź��");
				} else if (random == 2) {
					catlist.add(new Cat());
					catlist.get(catlist.size() - 1).birth = year;
					num++;
					System.out.println("����� ź��");
				} else if (random == 3) {
					parrotlist.add(new Parrot());
					parrotlist.get(parrotlist.size() - 1).birth = year;
					num++;
					System.out.println("�޹��� ź��");
				} else if (random == 4) {
					chickenlist.add(new Chicken());
					chickenlist.get(chickenlist.size() - 1).birth = year;
					num++;
					System.out.println("�� ź��");
				} else if (random == 5) {
					iguanalist.add(new Iguana());
					iguanalist.get(iguanalist.size() - 1).birth = year;
					num++;
					System.out.println("�̱��Ƴ� ź��");
				} else if (random == 6) {
					chameleonlist.add(new Chameleon());
					chameleonlist.get(chameleonlist.size() - 1).birth = year;
					num++;
					System.out.println("ī�᷹�� ź��");
				}
				// ���ó��
				for (int i = 0; i < doglist.size(); i++) {
					if (doglist.get(i).life - (year - doglist.get(i).birth) <= 0) {
						doglist.get(i).Death();
						doglist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("�� ���");
					}
				}
				for (int i = 0; i < catlist.size(); i++) {
					if (catlist.get(i).life - (year - catlist.get(i).birth) <= 0) {
						catlist.get(i).Death();
						catlist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("����� ���");
					}
				}
				for (int i = 0; i < parrotlist.size(); i++) {
					if (parrotlist.get(i).life
							- (year - parrotlist.get(i).birth) <= 0) {
						parrotlist.get(i).Death();
						parrotlist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("�޹��� ���");
					}
				}
				for (int i = 0; i < chickenlist.size(); i++) {
					if (chickenlist.get(i).life
							- (year - chickenlist.get(i).birth) <= 0) {
						chickenlist.get(i).Death();
						chickenlist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("�� ���");
					}
				}
				for (int i = 0; i < iguanalist.size(); i++) {
					if (iguanalist.get(i).life
							- (year - iguanalist.get(i).birth) <= 0) {
						iguanalist.get(i).Death();
						iguanalist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("�̱��Ƴ� ���");
					}
				}
				for (int i = 0; i < chameleonlist.size(); i++) {
					if (chameleonlist.get(i).life
							- (year - chameleonlist.get(i).birth) <= 0) {
						chameleonlist.get(i).Death();
						chameleonlist.remove(i); // �ƿ� ����Ʈ���� ���� ���� �������� �ȶ�
						System.out.println("ī�᷹�� ���");
					}
				}

			} else if (menu == 2) {
				System.out.println("�� " + Animal.num + "����");
				System.out.println("������ " + Mammal.num + "����");
				System.out.println("���� " + Bird.num + "����");
				System.out.println("����� " + Reptile.num + "����");
				System.out.println("�� " + Dog.num + "����");
				System.out.println("����� " + Cat.num + "����");
				System.out.println("�޹��� " + Parrot.num + "����");
				System.out.println("�� " + Chicken.num + "����");
				System.out.println("�̱��Ƴ� " + Iguana.num + "����");
				System.out.println("ī�᷹�� " + Chameleon.num + "����");
			} else if (menu == 3) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "��") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).Eat();
						}
					} else if (key == "�����") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).Eat();
						}
					} else if (key == "�޹���") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).Eat();
						}
					} else if (key == "��") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).Eat();
						}
					} else if (key == "�̱��Ƴ�") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).Eat();
						}
					} else if (key == "ī�᷹��") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).Eat();
						}
					}
				}
			} else if (menu == 4) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "��") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).Run();
						}
					} else if (key == "�����") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).Run();
						}
					} else if (key == "�޹���") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).Run();
						}
					} else if (key == "��") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).Run();
						}
					} else if (key == "�̱��Ƴ�") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).Run();
						}
					} else if (key == "ī�᷹��") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).Run();
						}
					}
				}

			} else if (menu == 5) {
				Iterator<String> keys = hm.keySet().iterator();
				while (keys.hasNext()) {
					String key = keys.next();
					if (key == "��") {
						for (int i = 0; i < doglist.size(); i++) {
							doglist.get(i).PrintInfo(year);
						}
					} else if (key == "�����") {
						for (int i = 0; i < catlist.size(); i++) {
							catlist.get(i).PrintInfo(year);
						}
					} else if (key == "�޹���") {
						for (int i = 0; i < parrotlist.size(); i++) {
							parrotlist.get(i).PrintInfo(year);
						}
					} else if (key == "��") {
						for (int i = 0; i < chickenlist.size(); i++) {
							chickenlist.get(i).PrintInfo(year);
						}
					} else if (key == "�̱��Ƴ�") {
						for (int i = 0; i < iguanalist.size(); i++) {
							iguanalist.get(i).PrintInfo(year);
						}
					} else if (key == "ī�᷹��") {
						for (int i = 0; i < chameleonlist.size(); i++) {
							chameleonlist.get(i).PrintInfo(year);
						}
					}
				}

			} else if (menu == 6) {
				System.out.println("� ������ �Ա⸦ ���");
				String what = s.next();
				if (what.equals("��")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).Eat();
					}
				} else if (what.equals("�����")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).Eat();
						;
					}
				} else if (what.equals("�޹���")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).Eat();
					}
				} else if (what.equals("��")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).Eat();
						;
					}
				} else if (what.equals("�̱��Ƴ�")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).Eat();
					}
				} else if (what.equals("ī�᷹��")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).Eat();
					}
				} else {
					System.out.println("���� �����Դϴ�");
				}
			} else if (menu == 7) {
				System.out.println("� ������ �ٱ⸦ ���");
				String what = s.next();
				if (what.equals("��")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).Run();
					}
				} else if (what.equals("�����")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).Run();
					}
				} else if (what.equals("�޹���")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).Run();
					}
				} else if (what.equals("��")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).Run();
					}
				} else if (what.equals("�̱��Ƴ�")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).Run();
					}
				} else if (what.equals("ī�᷹��")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).Run();
					}
				} else {
					System.out.println("���� �����Դϴ�");
				}

			} else if (menu == 8) {
				System.out.println("� ������ �������");
				String what = s.next();
				if (what.equals("��")) {
					for (int i = 0; i < doglist.size(); i++) {
						doglist.get(i).PrintInfo(year);
					}
				} else if (what.equals("�����")) {
					for (int i = 0; i < catlist.size(); i++) {
						catlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("�޹���")) {
					for (int i = 0; i < parrotlist.size(); i++) {
						parrotlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("��")) {
					for (int i = 0; i < chickenlist.size(); i++) {
						chickenlist.get(i).PrintInfo(year);
					}
				} else if (what.equals("�̱��Ƴ�")) {
					for (int i = 0; i < iguanalist.size(); i++) {
						iguanalist.get(i).PrintInfo(year);
					}
				} else if (what.equals("ī�᷹��")) {
					for (int i = 0; i < chameleonlist.size(); i++) {
						chameleonlist.get(i).PrintInfo(year);
					}
				} else {
					System.out.println("���� �����Դϴ�");
				}
			} else if (menu == 9) {

				try {
					FileWriter fwriter = new FileWriter("./src/Lab07/save.txt");
					BufferedWriter bwriter = new BufferedWriter(fwriter);
					Iterator<String> keys = hm.keySet().iterator();
					while (keys.hasNext()) {
						String key = keys.next();
						if (key == "��") {
							for (int i = 0; i < doglist.size(); i++) {
								fwriter.write("������#��#");
								fwriter.write(doglist.get(i).birth + "#");
								fwriter.write(doglist.get(i).life + "#");
								fwriter.write(doglist.get(i).feet + "#");
								fwriter.write(doglist.get(i).teeth + "#");
							}
						} else if (key == "�����") {
							for (int i = 0; i < catlist.size(); i++) {
								fwriter.write("������#�����#");
								fwriter.write(catlist.get(i).birth + "#");
								fwriter.write(catlist.get(i).life + "#");
								fwriter.write(catlist.get(i).feet + "#");
								fwriter.write(catlist.get(i).teeth + "#");
							}
						} else if (key == "�޹���") {
							for (int i = 0; i < parrotlist.size(); i++) {
								fwriter.write("����#�޹���#");
								fwriter.write(parrotlist.get(i).birth + "#");
								fwriter.write(parrotlist.get(i).life + "#");
								fwriter.write(parrotlist.get(i).feet + "#");
								fwriter.write(parrotlist.get(i).wing + "#");
							}
						} else if (key == "��") {
							for (int i = 0; i < chickenlist.size(); i++) {
								fwriter.write("����#��#");
								fwriter.write(chickenlist.get(i).birth + "#");
								fwriter.write(chickenlist.get(i).life + "#");
								fwriter.write(chickenlist.get(i).feet + "#");
								fwriter.write(chickenlist.get(i).wing + "#");
							}
						} else if (key == "�̱��Ƴ�") {
							for (int i = 0; i < iguanalist.size(); i++) {
								fwriter.write("�����#�̱��Ƴ�#");
								fwriter.write(iguanalist.get(i).birth + "#");
								fwriter.write(iguanalist.get(i).life + "#");
								fwriter.write(iguanalist.get(i).feet + "#");
							}
						} else if (key == "ī�᷹��") {
							for (int i = 0; i < chameleonlist.size(); i++) {
								fwriter.write("�����#ī�᷹��#");
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
				// �ϴ� ����
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
						if (sb.toString().equals("��������")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							doglist.add(new Dog());
							doglist.get(doglist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("�����������")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							catlist.add(new Cat());
							catlist.get(catlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("�����޹���")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							parrotlist.add(new Parrot());
							parrotlist.get(parrotlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("������")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 3; j++) {
								st.nextToken();
							}
							chickenlist.add(new Chicken());
							chickenlist.get(chickenlist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("������̱��Ƴ�")) {
							sb.delete(0, sb.length() + 1);
							st.hasMoreTokens();
							saveyear = Integer.parseInt(st.nextToken());
							for (int j = 0; j < 2; j++) {
								st.nextToken();
							}
							iguanalist.add(new Iguana());
							iguanalist.get(iguanalist.size() - 1).birth = saveyear;
						} else if (sb.toString().equals("�����ī�᷹��")) {
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
