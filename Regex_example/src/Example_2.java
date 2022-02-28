import java.util.regex.*;  
class Example_2{  
public static void main(String args[]){  
System.out.println(Pattern.matches(".s", "as"));//(2nd char is s)  
System.out.println(Pattern.matches(".s", "mk"));//(2nd char is not s)  
System.out.println(Pattern.matches(".s", "mst"));//(has more than 2 char)  
System.out.println(Pattern.matches(".s", "amms"));//(has more than 2 char)  
System.out.println(Pattern.matches("..s", "mas"));//(3rd char is s)  
}}  