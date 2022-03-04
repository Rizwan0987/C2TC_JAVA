  interface Lambdafuntion{  
    public void Lambdafuntion();  
}  
  
public class Example_2 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Lambdafuntion d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.Lambdafuntion();  
    }  
}  