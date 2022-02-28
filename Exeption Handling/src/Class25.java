public class Class25{

void m() throws Exception {

throw new java.io.IOException("Error");

}

void n()

{

m();

}

void p()

{

try {

n();

}

catch (Exception e) {

System.out.println(e); } }

public static void main(String args[]){

Class25 obj = new Class25();

obj.p();

System.out.println("Normal Flow");

} }