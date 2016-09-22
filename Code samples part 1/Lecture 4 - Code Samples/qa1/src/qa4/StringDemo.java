package qa4;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "abcdef";
		String s3 = new String("abcdef");
		
		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.indexOf("d"));
		System.out.println(s1.indexOf("bcd"));
		System.out.println(s1.indexOf("z"));
		
		s1 = s1.replace("d", "y");
//		s1.replaceAll("d", "y"); -> changes all occurrences of "d"
		System.out.println(s1);
		
		String s4 = "Hello: " + s1 + s2 + s3;
		System.out.println(s4);
	}
}
