package cn.zxh.com;

public class TestString {
	public static void main(String[] args) {
		String a ="abc";
		String b ="abc";
		String cc =new String("abc");
		System.out.println(a==b);
		System.out.println(a==cc);
		System.out.println(a.equals(cc));
		System.out.println(a.substring(1));
		System.out.println(a.codePointAt(2));
		System.out.println(a.replace("a","d" ));
		
	}
}
