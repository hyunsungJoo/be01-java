package homework;

//(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
public class homework_2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				sum -= i;
			}else {
			sum += i;
			}
		}
		System.out.println("(-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 =" + sum);
	}

}
