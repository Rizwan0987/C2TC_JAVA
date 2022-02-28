public class Finally_block{

public static void main(String args[]){

try{

int data = 30/3;

System.out.println(data);

}

catch(NullPointerException e)

{

System.out.println(e);

}

finally

{

System.out.println("finally block is always executed");

}

}

}
/*
10
finally block is always executed
*/