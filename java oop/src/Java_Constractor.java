class Java_Constractor{
  private String name;

  // constructor
  Java_Constractor() {
    System.out.println("Constructor Called:");
    name = "Programiz";
  }

  public static void main(String[] args) {

    // constructor is invoked while
    // creating an object of the Main class
    Java_Constractor obj = new Java_Constractor();
    System.out.println("The name is " + obj.name);
  }
}