import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ExampleTest {

  @Test
  void testUncoveredMethod() {
    assertThrows(RuntimeException.class, Example::uncoveredMethod);
  }

  @Test
  void testCoveredMethodOne() {
    Example.coveredMethodOne();
  }

  @Test
  void tetCoveredMethodTwo() {
    assertThrows(RuntimeException.class, Example::coveredMethodTwo);
  }

  @Test
  void testCoveredMethodThree() {
    Example.coveredMethodThree();
  }
}
