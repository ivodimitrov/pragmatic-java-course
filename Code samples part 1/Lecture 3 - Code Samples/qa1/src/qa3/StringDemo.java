package qa3;

public class StringDemo {
 public static void main(String[] args) {
	 String s1 = "alabala";
	 String s2 = "portokala";
	 
	 System.out.println(s1 == s2);
	 String s3 = new String("portokala");
	 
	 System.out.println(s2 == s3);
	 System.out.println(s2.equals(s3));
 }
}
