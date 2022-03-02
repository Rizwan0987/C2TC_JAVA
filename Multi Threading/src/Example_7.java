/*run method*/
class Example_7 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  Example_7 t1=new Example_7();  
  t1.run();//fine, but does not start a separate call stack  
 }  
}