public class Example_60

{

public static void main(String[] args)

{

SortedSet<String> set = new TreeSet<>();

set.add("Technical");

set.add("Technology");

set.add("quiz");

set.add("code");

System.out.println("SortedSet: "+ set);

Iterator value = set.iterator();

System.out.println("After Iterator:");

while (value.hasNext())

{

System.out.println(value.next());

}

}

}