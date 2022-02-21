package com.krish.string.stringbuffer.stringbuilder;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		
		/* CASE - 1 */
		
		System.out.println("CASE-1");
		//String objects are immutable.
		String s1 = new String("krish");
		s1.concat("sure");
		
		System.out.println(s1);
		
		//StringBuffer objects are mutable.
		StringBuffer sb1 = new StringBuffer("krish");
		sb1.append("sure");
		
		System.out.println(sb1);
		
		/* CASE - 2 */
		
		System.out.println("\nCASE-2");
		String s2 = new String("krish");
		String s3 = new String("krish");
		
		System.out.println(s2 == s3);
		//String class is Overridden equals method for content comparison.
		System.out.println(s2.equals(s3));
		
		StringBuffer sb2 = new StringBuffer("krish");		
		StringBuffer sb3 = new StringBuffer("krish");
		
		System.out.println(sb2 == sb3);
		//StringBuffer class dosn't Overridden equals method.
		//using equals method from Object class which is reference comparison.
		System.out.println(sb2.equals(sb3));
		
		/* CASE - 3 */
		
		System.out.println("\nCASE-3");
		//s4 creates 2 objects 1 in Heap area and 2nd in string constant pool(scp)
		//MethodArea/PermGen until 1.6V but from 1.7V scp moved to Heap area.
		String s4 = new String("krish");
		
		//s5 creates only one object in scp.
		String s5 = "krish";
		
		/*
		 * Totally 3 Objects will create [2-Heap("krish", "krish"), 1-SCP("krish")]
		 * s6 it will create 1 object in Heap and 2nd in scp area
		 * s7 it will create 1 object in Heap and no object will create in scp since s6 already created with same content
		 * s8 and s9 will not create any objects in scp since s6 already created with same content.
		 * Finally 3 Objects will be created 2 in Heap and 1 in scp area.
		 */
		String s6 = new String("krish");
		String s7 = new String("krish");
		String s8 = "krish";
		String s9 = "krish";
		
		/* 
		 * Totally 6 Objects will create [3-Heap("krish", "krishbabu", "krishsure"), 3-SCP("krish", "babu", "sure")]
		 * s10 it will create 1 object in Heap and 2nd in SCP
		 * s10.concat("babu") it will create 1 object in Heap and 2nd in SCP and Heap object and it is eligible for GC(Heap) since there is no reference
		 * s10 = s10.concat("sure") it will create 1 object in Heap and 2nd in SCP 
		 * and s10 "krish" heap object will be eligible for GC 
		 * 
		 */
		String s10 = new String("krish");
		s10.concat("babu");
		s10 = s10.concat("sure");
		
		
		/* 
		 * Totally 8 objects will create [4-Heap("spring", "springfall", "springwinter", "springwintersummer"), 4-SCP("spring", "fall", "winter", "summer")]
		 * s11 it will create 1 object in Heap and 2nd in SCP
		 * s11.concat("fall") it will create 1 object in Heap and 2nd in SCP
		 * s12 it will create 1 object in Heap and 2nd in SCP
		 * s12.concat("summer") it will create 1 object in Heap and 2nd in SCP
		 * "springfall" and "springwintersummer" are eligible for GC
		 * */
		String s11 = new String("spring");
		s11.concat("fall");
		
		String s12 = s11.concat("winter");
		s12.concat("summer");
		
		System.out.println(s11);
		System.out.println(s12);
		
		/* 
		 * Totally 6 objects will create 
		 * 3-Heap("you cannot change me", "you cannot change me", "you cannot change me")
		 * 3-SCP("you cannot change me", "you cannot", "change me")
		 * 
		 * 
		 */
		String s13 = new String("you cannot change me");
		String s14 = new String("you cannot change me");
		System.out.println(s13 == s14);
		
		String s15 = "you cannot change me";
		System.out.println(s13 == s15);
		
		String s16 = "you cannot change me";
		System.out.println(s15 == s16);
	
		String s17 = "you cannot " + "change me";//Compiler itself perform concatenation s17 = "you cannot change me"
		System.out.println(s16 == s17);
		
		String s18 = "you cannot ";
		String s19 = s18 + "change me";//at least one variable it will perform at run time.
		System.out.println(s16 == s19);
		
		//since it is final compiler itself add the value and become "you cannot " + "change me"
		//Now it become "you cannot " + "change me" and compiler itself perform concatenation s21 = "you cannot change me" 
		final String s20 = "you cannot "; 
		String s21 = s20 + "change me";
		System.out.println(s16 == s21);
		
		//String constructors
		//String c1 = new String();
		String c1 = new String();
		//String c2 = new String(string literral);
		String c2 = new String("");
		//String c3 = new String(StringBuffer sb);
		String c3 = new String(new StringBuffer());
		//String c4 = new String(StringBuilder sb);
		String c4 = new String(new StringBuilder());
		//String c5 = new String(char[] ch);
		char[] ch = {'k', 'r', 'i', 's', 'h'};
		String c5 = new String(ch);//java
		//String c6 = new String(byte[] b);
		byte[] b = {97,98,99,100};
		String c6 = new String(b);//abcd
		
		//String methods
		String s22 = "KRISH";
		//charAt()
		System.out.println(s22.charAt(2));
		//System.out.println(s22.charAt(20));//java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		//concat()
		s22 = s22.concat("SURE");
				//OR
		s22 = s22 + "SURE";
				//OR
		s22 += "SURE";
		System.out.println(s22);
		
		String s23 = "KRISH";
		//equals()
		System.out.println("krish".equals(s23));
		//equalsIgnoreCase()
		System.out.println("krish".equalsIgnoreCase(s23));
		
		//isEmpty() and length() methods
		String s24 = "";
		System.out.println(s24.isEmpty());
		System.out.println(s24.length());
		String s25 = "krish";
		System.out.println(s25.isEmpty());
		System.out.println(s25.length());
		
		//replace(char old, char new)
		String s26 = "krish";
		System.out.println(s26.replace("i", "!").replace("s", "$"));
		
		//substring(int beginIndex), substring(int beginIndex, endIndex) 
		//result will be beginIndex + endIndex -1
		System.out.println(s26.substring(1));
		System.out.println(s26.substring(1, 4));
		
		//indexOf(char c), lastIndexOf(char c)
		String s27 = "krishnababU";
		System.out.println(s27.indexOf("a"));
		System.out.println(s27.lastIndexOf("a"));
		
		//toUpperCase(), toLowerCase()
		System.out.println(s27.toUpperCase());
		System.out.println(s27.toLowerCase());
	}
}
