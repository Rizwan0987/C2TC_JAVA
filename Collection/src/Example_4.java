public class Example_4

{

public static void main(String [] args){

List<Integer> val = new ArrayList<>();

val.add(0);

val.add(11);

val.add(23);

val.add(34);

val.add(45);

for(Integer e : val)

{

System.out.print( e);

}

System.out.println("ArrayList : " + val);

}

}