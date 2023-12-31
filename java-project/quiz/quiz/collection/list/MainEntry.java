package quiz.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customers c = new Customers();
		ArrayList<Customers> list = new ArrayList<>();
	
		int num = 0;
		
		while(num != 4) {
			System.out.print("선택하세요 : 1.add, 2.remove, 3.set, 4. 종료 ");
			num = sc.nextInt();
			switch(num) {
			case 1: 
				list.add(new Customers().add()); break;
			case 2: 
				try{
					list.remove(c.delete()); break;
				}
				catch(Exception e) {
					System.out.println("삭제할 요소가 비어있습니다."); break;
				}
			case 3:
				try {
				list.set(c.set(), c); break;
				}
				catch(Exception e) {
					System.out.println("변경할 요소가 비어있습니다."); break;
				}
			}
			System.out.println();
			
			Iterator it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println();
		}
	}
}

