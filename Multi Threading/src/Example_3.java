class Example_3 extends Thread{    
 public void run(){    
  for(int i=1;i<5;i++){   
  // the thread will sleep for the 500 milli seconds   
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
    System.out.println(i);    
  }    
 }    
 public static void main(String args[]){    
  Example_3 t1=new Example_3();    
  Example_3 t2=new Example_3();    
     
  t1.start();    
  t2.start();    
 }    
}    