package day06_method.overload;

public class MainEntry {
	
	public static int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public static double plus(int x, int y, int z, int a) {
		return x + y + z + a;
	}
	
	public static void add(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static void add(int str1, int str2) {
		System.out.println(str1 + str2);
	}
	
	public static void add(double str1, double str2) {
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
		
	}
}
