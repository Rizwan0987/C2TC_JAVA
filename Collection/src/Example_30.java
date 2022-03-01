public class Example_30 {
	public static void main(String [] args) {

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ravi");

		ll.add("Vijay");

		ll.add("Harsh");

		ll.add("Gaurav");

		ll.add("Harsh");

		ll.add("Amit");

		ll.removeLastOccurrence("Harsh");

		System.out.println("After invoking removeLastOccurrence() method: "+ll);
}
}