package cn.zxh.com;



/**
 * ���ԷǾ�̬�ڲ���
 * @author Administrator
 *
 */
public class Testinnerclass {
	public static void main(String[] args) {
		Out.Inner inner = new Out().new Inner();
		inner.testIn();
	}
	
}
class Out{
	private int a=1;
	public void testOut() {
		
	};
	class Inner{
		int a=2;
		public void testIn() {
	    int a=3;
	    System.out.println(this.a);//2
	    System.out.println(Out.this.a);//1  �����this
	    System.out.println(a);//3
		}
	}
}
