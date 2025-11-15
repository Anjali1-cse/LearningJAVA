
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcd");
		
		System.out.println(sb.length());
		sb.insert(2, "jkl");
		System.out.println(sb);

	}

}
