package game;
import java.util.Scanner;
public class Game001 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("HP�����");
		int h = s.nextInt();
		System.out.println("EXP�����");
		int e = s.nextInt();
		System.out.println("MONEY�����");
		int m = s.nextInt();
		System.out.println("���O�����");
		String n = s.next();

		System.out.println("-----�X�e�[�^�X-----");
		System.out.println("HP:" + h);
		System.out.println("EXP:" + e);
		System.out.println("MONEY:" + m);
		System.out.println("NAME:" + n);
		System.out.println("�Z�[�u���܂���");
		System.out.println("�X�e�[�^�X�̏�����");

		System.out.println("-----�X�e�[�^�X-----");
		h = 0;
		e = 0;
		m = 0;
		

	}
}
