package demo7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class simple {
	int a;
	float b;
	double c;

	public simple() {
		this.a = 0;
		this.b = 0.0f;
		this.c = 0.0;
	}

	void hello() {
		System.out.println("hi");
	}
}

public class Program2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("demo7.simple");
		System.out.println(c.getName());

		Field f[] = c.getDeclaredFields();
		for (Field f1 : f) {
			System.out.println(f1);
		}

		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1);
		}

		Constructor<?> con[] = c.getDeclaredConstructors();
		for (Constructor<?> con1 : con) {
			System.out.println(con1);
		}
		{

		}

	}

}
