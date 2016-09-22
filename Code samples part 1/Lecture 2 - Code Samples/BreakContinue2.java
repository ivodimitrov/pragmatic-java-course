package lecture2;

public class BreakContinue2 {
	public static void main(String[] args) {
		for (int i = 100; i > 0; i--) {
			if (i % 6 == 0) {
				continue;
			}

			System.out.println(i);

			if (i == 55) {
				System.out.println("I am free");
				break;
			}
		}
	}
}
