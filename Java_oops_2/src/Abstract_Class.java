abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Abstarct_Class extends Language {

  public static void main(String[] args) {
    
    // create an object of Main
    Abstract_Class obj = new Abstract_Class();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}