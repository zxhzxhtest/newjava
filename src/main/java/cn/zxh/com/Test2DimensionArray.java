package cn.zxh.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2DimensionArray {
	static class Person{
		int age;
		String name;
		int goal;
		public Person(int age, String name, int goal) {
			super();
			this.age = age;
			this.name = name;
			this.goal = goal;
		}
		public String toString() {
			return this.name;
		}
		
	}
	public static void main(String[] args) {
		int[][] a=new int[3][];
		a[0]=new int[] {1,3,2};
		Person[][] oPersons=new Person[2][];
		oPersons[0]=new Person[] {new Person(18, "pan", 80)};
		Person[][] p1= {
				{new Person(18, "pan", 80),new Person(18, "pan", 80),new Person(18, "pan", 80)}
		};
		
		//System.out.println(Arrays.toString(oPersons[0]));
		for(Person[] p3:p1) {
			System.out.println(Arrays.toString(p3));
		}
	}

}
