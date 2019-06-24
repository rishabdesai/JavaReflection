package demo7;

import java.lang.reflect.Modifier;

public class Program implements Cloneable {

	private int a;

	public Program4() {
		this.a = 0;
	}

	public static void main(String[] args) {

		Program p = new Program();
		Class<?> c = p.getClass();

		System.out.println("class name :" + c.getName());
		System.out.println("Class class name :" + c.getClass().getName());
		System.out.println("superclass name :" + c.getSuperclass().getName());

		Class<?>[] c1 = c.getInterfaces();
		System.out.print("interface :");
		for (Class<?> cls : c1) {
			System.out.println(cls.getName() + " ");
		}

		int i = c.getModifiers();
		System.out.print("access modifier :" + Modifier.toString(i));
	}

}
