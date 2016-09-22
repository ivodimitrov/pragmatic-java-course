package qa2;

public class WhileExample3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 100) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}