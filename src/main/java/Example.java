public class Example {

  private Example(){}

  public static void uncoveredMethod() {
    calleeThrowsException();
  }

  public static void coveredMethodOne() {
    calleeThrowsNoException();
  }

  public static void coveredMethodTwo() {
    throw new RuntimeException();
  }

  public static void coveredMethodThree() {
    System.out.println("hello");
  }

  private static void calleeThrowsException() {
    throw new RuntimeException();
  }

  private static void calleeThrowsNoException() {
    System.out.println("hello");
  }
}
