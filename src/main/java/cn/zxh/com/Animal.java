package cn.zxh.com;

public abstract class Animal {
	//1û��ʵ�֣�2�������ʵ��
	abstract public void see();
	
	public void run() {
		System.out.println("runrun");
	}
	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.see();
		
	}
}

class Dog extends Animal{
	public void see() {
		System.out.println("����");
	}
//	public static void main(String[] args) {
//		System.err.println("no");
//	}
}