public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Test");
        System.out.println();

        testSabiranje();
        testOduzimanje();
        testMnozenje();
        testDeljenje();
        testNepravilanUnos();
        testRedosledOperacija();
        testZagrade();

        System.out.println();
        System.out.println("Kraj testa");
    }

    private static void testSabiranje() {
        assertEquals("5.0", Calculator.Run("2+3"), "Sabiranje", "2+3");
    }

    private static void testOduzimanje() {
        assertEquals("2.0", Calculator.Run("5-3"), "Oduzimanje", "5-3");
    }

    private static void testMnozenje() {
        assertEquals("12.0", Calculator.Run("3*4"), "Mnozenje", "3*4");
    }

    private static void testDeljenje() {
        assertEquals("2.0", Calculator.Run("6/3"), "Deljenje", "6/3");
    }

    private static void testNepravilanUnos() {
        assertEquals("ERROR", Calculator.Run("2+a"), "Nepravilan unos", "2+a");
    }

    private static void testRedosledOperacija() {
        assertEquals("6.0", Calculator.Run("2+2*2"), "Redosled operacija", "2+2*2");
    }

    private static void testZagrade() {
        assertEquals("8.0", Calculator.Run("(2+2)*2"), "Zagrade", "(2+2)*2");
    }

    private static void assertEquals(String expected, String actual, String testName, String expression) {
        System.out.println("Test: " + testName);
        System.out.println("  Expression: " + expression);
        System.out.println("  Expected:   " + expected);
        System.out.println("  Actual:     " + actual);

        if (!expected.equals(actual)) {
            System.out.println("  Result:     FAILED");
            System.out.println("  Expected '" + expected + "' but got '" + actual + "'.");
        } else {
            System.out.println("  Result:     PASSED");
        }

        System.out.println();
    }
}
