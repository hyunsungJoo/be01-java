package homework;

// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?  7.07
public class homework_3 {
	public static void main(String[] args) {
		
		double sum = 0;
		for(int i = 1; i <= 9; i++) {
			sum += (double)i / (i+1);
		}
		System.out.printf("1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = %.2f",sum);
	}

}
