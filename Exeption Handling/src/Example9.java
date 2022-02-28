public class Example9{
public static void main(String[] args)

{

String[] s = {"Hello", "423", null, "Hi"};

for (int i = 0; i < 5; i++)

{

try{

int a = s[i].length() + Integer.parseInt(s[i]);

System.out.println(a);

}

catch(NumberFormatException ex)

{

System.out.println("NumberFormatException");

}

System.out.println("contunue");

}
}
}
//output
//NumberFormatException
//contunue
//Exception in thread "main" 426
//contunue
//java.lang.NullPointerException: Cannot invoke "String.length()" because "s[i]" is null
	//at Example9.main(Example9.java:14)
