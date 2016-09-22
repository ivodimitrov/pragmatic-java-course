package qa6.practice;

public class StaticCounter {
	private static int counter;
	
	public int getCounter() {
		return counter;
	}

	public StaticCounter() {
		counter++;
	}
	
	public static void main(String[] args) {
		StaticCounter sc1 = new StaticCounter();
		sc1 = new StaticCounter();
		sc1 = new StaticCounter();
		System.out.println(sc1.getCounter());
		System.out.println(StaticCounter.counter);
	}
}
