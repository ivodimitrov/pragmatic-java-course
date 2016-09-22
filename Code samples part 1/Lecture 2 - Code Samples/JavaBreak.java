package qa2;

public class JavaBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i % 8 == 0) {
				continue;
			}
			if (i == 73) {
				break;
			}
			System.out.println(i);
		}
	}
}
