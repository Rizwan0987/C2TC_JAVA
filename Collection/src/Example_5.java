public class Example_5

{

public static void main(String [] args){

List<Integer> val = new ArrayList<>();

val.add(0);

val.add(11);

val.add(23);

Iterator z=val.iterator();

while(z.hasNext())

{

System.out.print(z.next());}

System.out.println("ArrayList : " + val);

}

}