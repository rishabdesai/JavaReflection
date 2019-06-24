package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Program1 {

	public static void printTypeInfo(Class<?> c)
	{
		 System.out.println("****************************************************************");
		 Package pkg = c.getPackage();
		 System.out.println("Package Info			:	"+pkg.getName());
		 System.out.println("Type Info			:	"+c.getSimpleName());
		 
		 Class<?> superClass = c.getSuperclass();
		 if( superClass != null)
			 System.out.println("Super Class			:	"+superClass.getSimpleName());
		 
		 System.out.print("Implemented Interface(s)	:	");
		 Class<?>[] arr = c.getInterfaces();
		 if( arr != null )
		 {
			 for (Class<?> intfs : arr) {
				System.out.print(intfs.getSimpleName()+" ");
			 }
		 }
		System.out.println("\n****************************************************************");
	}
	public static void printFieldInfo( Field[] fields )
	{
		if( fields != null )
		{
			System.out.println("Field Info	:	");
			for (Field field : fields) 
			{
				int mod = field.getModifiers();
				String modifier =  Modifier.toString(mod);
				String typeName = field.getType().getSimpleName();
				String name = field.getName();
				System.out.println(modifier+" "+typeName+" "+name);
				//System.out.println(field);
			}
			System.out.println("****************************************************************");
		}
	}
	public static void printConstructorInfo( Constructor<?>[] constructors )
	{
		if( constructors != null )
		{
			System.out.println("Constructor Info	:	");
			for (Constructor<?> constructor : constructors) {
				System.out.println(constructor.toString());
			}
			System.out.println("****************************************************************");
		}
	}
	public static void printMethodInfo( Method[] methods)
	{
		if( methods != null )
		{
			System.out.println("Method Info	:	");
			for (Method method : methods) {
				System.out.println(method);
			}
			System.out.println("****************************************************************");
		}
	}
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("F.Q.Class Name : ");
			String className = sc.nextLine();
			
			Class<?> c = Class.forName(className);
			Program.printTypeInfo(c);
			
			Field[] fields = c.getFields();
			Program.printFieldInfo( fields );
			
			Constructor<?>[] constructors = c.getConstructors();
			Program.printConstructorInfo(constructors);
			
			Method[] methods = c.getMethods();
			Program.printMethodInfo( methods );
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
