public class Example_64

{

public static void main(String a[])

{

TreeSet<String> ts = new TreeSet<String>(Arrays.asList("red", "orange",
"blue","green","white","brown","yellow","black"));

System.out.println(ts);

subSet = ts.subSet"green"false,"hit",true);

System.out.println("sub set: "+subSet);

subSet = ts.subSet("reen",true,"white,true);

System.out.println("sub set: "+subSet);

subSet = ts.subSet("reen",false,"hit",false);

System.out.println("sub set: "+subSet);

}

}
