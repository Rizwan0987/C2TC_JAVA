import java.time.*;  
public class Example_3 {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.of(2022, 2,23);  
    LocalDateTime datetime = date.atTime(1,50,9);      
    System.out.println(datetime);   
  }  
}  