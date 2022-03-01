public class Example_14

{

public static void main(String[] args)

{

List<String> arrlist = new ArrayList<>();

arrlist.add("java");

arrlist.add("Technical");

arrlist.add("webinar");

System.out.println("List elements before Replacements: "+arrlist);

Collections.fill(arrlist,"technology");

System.out.println("List elements after Replacements: "+arrlist);

}

}