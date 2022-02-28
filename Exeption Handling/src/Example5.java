import java.io.FileInputStream;

public class Example5{

public static void main(String[] args) {

FileInputStream fis = null;

fis = new FileInputStream(“D:/myfile.txt");

int k;

while(( k = fis.read() ) != -1)

{

System.out.print((char)k);

}

fis.close();

}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	//Syntax error on tokens, Expression expected instead
	//Syntax error, insert ")" to complete ClassInstanceCreationExpression
	//Syntax error, insert ";" to complete Statement
	//String literal is not properly closed by a double-quote
	//at Example5.main(Example5.java:9)