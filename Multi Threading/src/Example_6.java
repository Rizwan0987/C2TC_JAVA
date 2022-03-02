//Testthreadtwise//
public class Example_6 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  Example_6 t1=new Example_6();  
  t1.start();  
  t1.start();  
 }  
}  
/*
output:
Exception in thread "main" running...
java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at Example_6.main(Example_6.java:9)
*/