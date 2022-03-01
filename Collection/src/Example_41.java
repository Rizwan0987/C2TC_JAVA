import java.util.Iterator;

import java.util.List;

import java.util.ArrayList;

public class Example_41{

public static void main(String[] args) {

List<String> i=new ArrayList<String>();

i.add("a");

i.add("b");

Iterator<String> z= i.iterator();

while(z.hasNext())

{

System.out.println(z.next());

}

i.add("c");

}