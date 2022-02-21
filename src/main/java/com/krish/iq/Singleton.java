package com.krish.iq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton implements Serializable, Cloneable {
	
	private static Singleton singleton = null;

	private Singleton() {
		/* Reflection solution start */
		if(singleton != null)
			throw new RuntimeException("Can't create, please use getInstance()");
		/* Reflection solution end */
		
		System.out.println("Created Singleton instance...");
	}
	
	public static Singleton getInstance() {
		//Double check locking.
		if(null == singleton) {//Check 1
			synchronized (Singleton.class) {
				if(null == singleton) {//Check 2
					singleton = new Singleton();
				}
			}
		}
			
		
		return singleton;
	}
	
	/* Serialization/De-serialization solution start */
	private Object readResolve() throws ObjectStreamException {
		System.out.println("read resolve method");
		return singleton;
	}
	/* Serialization/De-serialization solution end */
	
	/* Clone solution start */
	protected Object clone() throws CloneNotSupportedException {
		//To test Clone break uncomment below code
		return super.clone(); //OR return singleton;
	}
	/* Clone solution end */
	
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//If we put Reflection code before s1 then again it breaks and creates multiple objects.
		/* Reflection break start */
		System.out.println("Using Reflection\n");
		Class clazz = Class.forName("com.krish.iq.Singleton");
		Constructor<Singleton> csing = clazz.getDeclaredConstructor();
		csing.setAccessible(true);
		
		//To test Reflection break uncomment below two lines of code
		//Singleton s3 = csing.newInstance();
		//System.out.println(s3);
		
		/* Reflection break end */
		
		/* Serialization/De-serialization break start */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\krishna\\Java\\singleton.ser"));
		oos.writeObject(s2);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\krishna\\Java\\singleton.ser"));
		Singleton s4 = (Singleton) ois.readObject();
		ois.close();
		
		System.out.println(s4);
		/* Serialization/De-serialization break end */
		
		/* Clone break start */
		Singleton s5 = (Singleton) s1.clone();
		System.out.println(s5);
		/* Clone break end */
		
		/* Multithreading break start */
		Thread.sleep(50000);
		System.out.println("Multithreading");
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(Singleton::getInstance);
		service.submit(Singleton::getInstance);
		
		service.shutdown();
		
		/* Multithreading break end */
	}

}
