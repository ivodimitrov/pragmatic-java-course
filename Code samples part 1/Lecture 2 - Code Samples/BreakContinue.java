package lecture2;

public class BreakContinue {
	public static void main(String[] args) {
		System.out.println("Преди цикъл for");
		
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0) {
				continue;
			}
			
			System.out.println(i);
			
			if (i == 67) {
				System.out.println("Breaking bad");
				break;
			}
		}
		
		System.out.println("След цикъл for");
	}
}
