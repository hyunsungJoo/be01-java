package day02_Input;

public class MainInputTest {
	public static void main(String[] args) {
		
//		System.out.println("String, int = ");
		
		if(args.length <= 0) {
			System.out.println("데이터 입력하세요.");
			return;//제어권 넘김
		}
		
		String name = args[0];
		int su = Integer.parseInt(args[1]);
		
		System.out.println(name);
		System.out.println(su);
	}
}
