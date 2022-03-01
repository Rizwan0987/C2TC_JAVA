public class Example_10

{

public static void main(String[] args)

{

List<Integer> list = new ArrayList<>();

list.add(80);

list.add(05);

list.add(32);

list.add(2);

System.out.println("Original List : " + list);

Collections.sort(list);

System.out.println(“Sorted List: " + list);

}

}