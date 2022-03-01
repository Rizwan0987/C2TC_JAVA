class Example_27{
public static void main(String [] args) {

LinkedList<String> ll=new LinkedList<String>();

ll.add("Ravi");

ll.add("Vijay");

ll.add("Harsh");

ll.add("Gaurav");

ll.add("Harsh");

ll.add("Amit");

ll.remove(0);

System.out.println("After invoking remove(index) method: "+ll);
}
}