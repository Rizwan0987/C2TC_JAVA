class Example_8 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  Example_8 t1=new Example_8();  
  Example_8 t2=new Example_8();  
   
  t1.run();  
  t2.run();  
 }  
} 