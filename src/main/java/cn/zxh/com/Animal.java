package cn.zxh.com;

public abstract class Animal {
	//1没有实现，2子类必须实现
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
		System.out.println("狗看");
	}
//	public static void main(String[] args) {
//		System.err.println("no");
//	}
}