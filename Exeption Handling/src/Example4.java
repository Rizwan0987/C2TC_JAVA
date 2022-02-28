public class Example4{

public static void main(String[] args){
System.out.println("First line");

System.out.println("Second line");

int[] myIntArray = new int[]{1, 2, 3};

print(myIntArray);

System.out.println("Third line");

}

public static void print(int[] arr) {

System.out.println(arr[3]);

System.out.println("Fourth element successfully displayed!");


}
}
//First line
//Second line
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//at Example4.print(Example4.java:18)
//at Example4.main(Example4.java:10