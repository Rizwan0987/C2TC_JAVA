
public class Example_32 {

	public static void main(String args[]){

		LinkedList<String> ll=new LinkedList<String>();

		ll.add("Ravi");

		ll.add("Vijay");

		ll.add("Ajay");

		Iterator i=ll.descendingIterator();

		while(i.hasNext())

		{

		System.out.println(i.next());

		} }
}
