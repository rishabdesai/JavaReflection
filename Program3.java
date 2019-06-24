 package demo7;

class tempPrint {
	void message() {
		System.out.println("hello from message method of tempPrint class");
	}
}

public class Program3 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// tempPrint tp=new tempPrint();
		// Class<?> c=tp.getClass();
		// System.out.println(c.getName());
		Class<?> c1 = tempPrint.class;
		tempPrint tp1 = (tempPrint) c1.newInstance();
		tp1.message();

	}

}
