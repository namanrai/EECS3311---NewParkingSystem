import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "hi!", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "hi!", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "", "", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "hi!", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "hi!", 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "", "", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("", user1, "hi!", "", 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        Models.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Models.Card card6 = new Models.Card("hi!", user1, "hi!", "", (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

