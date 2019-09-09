package asd;



public class Test05 {
	
	 public static int k = 0;
	 public static Test05 t1 = new Test05("t1");
	 public static Test05 t2 = new Test05("t2");
	 public static int i = print("i");
	 public static int n = 99;
	 
	 public int j = print("j");
	 {
	  System.out.println("asd");
	  print("¹¹ÔìÆ÷asd");
	 }
	 static {
	  
	  print("¾²Ì¬¿é");
	 }
	 public Test05(String str) {
	  System.out.println((++k) + ":" + str + " i=" + i + " n=lllllll" + n);
	  ++n;
	  ++i;
	 }
	 public static int print(String str) {
	  System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
	  ++n;
	  return ++i;
	 }
	 public static void main(String[] args) {
	  
	 }

}
