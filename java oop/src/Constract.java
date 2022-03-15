/*Java private no-arg constructor*/
class Constract {

  int i;

  // constructor with no parameter
  private Constract() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {

    // calling the constructor without any parameter
    Constract obj = new Constract();
    System.out.println("Value of i: " + obj.i);
  }
}
