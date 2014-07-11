package game;
import java.util.Scanner;
public class Game001 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("HPを入力");
		int h = s.nextInt();
		System.out.println("EXPを入力");
		int e = s.nextInt();
		System.out.println("MONEYを入力");
		int m = s.nextInt();
		System.out.println("名前を入力");
		String n = s.next();

		System.out.println("-----ステータス-----");
		System.out.println("HP:" + h);
		System.out.println("EXP:" + e);
		System.out.println("MONEY:" + m);
		System.out.println("NAME:" + n);
		System.out.println("セーブしました");
		System.out.println("ステータスの初期化");

		System.out.println("-----ステータス-----");
		h = 0;
		e = 0;
		m = 0;
		

	}
}
