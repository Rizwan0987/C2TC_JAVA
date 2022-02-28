import java.time.LocalDate;    
public class Dateexample_2 {    
  public static void main(String[] args) {    
    LocalDate date1 = LocalDate.of(2022, 2, 23);    
    System.out.println(date1.isLeapYear());    
    LocalDate date2 = LocalDate.of(2021, 9, 13);    
    System.out.println(date2.isLeapYear());    
  }    
}    