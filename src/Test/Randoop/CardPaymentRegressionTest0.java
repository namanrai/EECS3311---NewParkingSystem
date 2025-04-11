import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardPaymentRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = card7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        boolean boolean3 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1, card1);
        boolean boolean3 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = card4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.getCard();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = card7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.card;
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = null;
        cardPayment2.card = card4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100, card1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = card6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        Models.Card card11 = null;
        cardPayment2.card = card11;
        boolean boolean13 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = card3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 1, card1);
        boolean boolean3 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        boolean boolean3 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        boolean boolean9 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1, card1);
        boolean boolean3 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        Models.Card card9 = null;
        cardPayment2.card = card9;
        java.lang.Class<?> wildcardClass11 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) -1, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0L, card1);
        Models.Card card3 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(10.0f, card1);
        boolean boolean3 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        Models.Card card11 = null;
        cardPayment2.card = card11;
        java.lang.Class<?> wildcardClass13 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.processPayment();
        Models.Card card10 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 0, card1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.processPayment();
        Models.Card card8 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 10, card1);
        Models.Card card3 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 1, card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 1, card1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = null;
        cardPayment2.card = card7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.processPayment();
        boolean boolean5 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        Models.Card card3 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = null;
        cardPayment2.card = card10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.processPayment();
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.getCard();
        boolean boolean9 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1), card1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.isPaid();
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) -1, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        boolean boolean6 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 1, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = cardPayment2.getCard();
        boolean boolean6 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        boolean boolean3 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1L, card1);
        boolean boolean3 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = null;
        cardPayment2.card = card8;
        boolean boolean10 = cardPayment2.isPaid();
        Models.Card card11 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = card3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = null;
        cardPayment2.card = card7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 0, card1);
        boolean boolean3 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) ' ', card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1, card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.getCard();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = card7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        boolean boolean9 = cardPayment2.isPaid();
        boolean boolean10 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.processPayment();
        Models.Card card9 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = null;
        cardPayment2.card = card8;
        Models.Card card10 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass8 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        Models.Card card11 = cardPayment2.getCard();
        Models.Card card12 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = null;
        cardPayment2.card = card8;
        boolean boolean10 = cardPayment2.isPaid();
        Models.Card card11 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = cardPayment2.getCard();
        Models.Card card9 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 100, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = cardPayment2.card;
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = null;
        cardPayment2.card = card6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = null;
        cardPayment2.card = card4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 100, card1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.processPayment();
        boolean boolean8 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.card;
        Models.Card card9 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass5 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.processPayment();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) -1, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.getCard();
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = null;
        cardPayment2.card = card10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        Models.Card card8 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        Models.Card card9 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(100.0f, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10, card1);
        Models.Card card3 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = card3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.card;
        Models.Card card9 = cardPayment2.getCard();
        Models.Card card10 = cardPayment2.getCard();
        Models.Card card11 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 1, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) ' ', card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) ' ', card1);
        boolean boolean3 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) ' ', card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(1.0f, card1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.processPayment();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        boolean boolean8 = cardPayment2.isPaid();
        boolean boolean9 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        Models.Card card8 = cardPayment2.getCard();
        boolean boolean9 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) -1, card1);
        java.lang.Class<?> wildcardClass3 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        boolean boolean11 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 1L, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        Models.Card card8 = cardPayment2.getCard();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.isPaid();
        boolean boolean10 = cardPayment2.processPayment();
        boolean boolean11 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = card7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = card7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        Models.Card card9 = cardPayment2.getCard();
        boolean boolean10 = cardPayment2.processPayment();
        Models.Card card11 = null;
        cardPayment2.card = card11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(100.0f, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        boolean boolean8 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.processPayment();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        Models.Card card3 = cardPayment2.getCard();
        boolean boolean4 = cardPayment2.processPayment();
        Models.Card card5 = cardPayment2.getCard();
        boolean boolean6 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '4', card1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.getCard();
        boolean boolean6 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.getCard();
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.processPayment();
        Models.Card card8 = null;
        cardPayment2.card = card8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = null;
        cardPayment2.card = card6;
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = null;
        cardPayment2.card = card7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        Models.Card card9 = null;
        cardPayment2.card = card9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) 1, card1);
        boolean boolean3 = cardPayment2.processPayment();
        Models.Card card4 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = cardPayment2.getCard();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.isPaid();
        boolean boolean9 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) -1, card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.getCard();
        Models.Card card9 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.isPaid();
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = cardPayment2.getCard();
        Models.Card card11 = null;
        cardPayment2.card = card11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) ' ', card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        boolean boolean3 = cardPayment2.processPayment();
        java.lang.Class<?> wildcardClass4 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        Models.Card card9 = cardPayment2.card;
        java.lang.Class<?> wildcardClass10 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.card;
        Models.Card card9 = cardPayment2.getCard();
        boolean boolean10 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment(0.0f, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        Models.Card card5 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        Models.Card card9 = null;
        cardPayment2.card = card9;
        Models.Card card11 = cardPayment2.card;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 100L, card1);
        Models.Card card3 = cardPayment2.getCard();
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        boolean boolean6 = cardPayment2.processPayment();
        Models.Card card7 = cardPayment2.card;
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.getCard();
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.isPaid();
        Models.Card card10 = null;
        cardPayment2.card = card10;
        Models.Card card12 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        boolean boolean7 = cardPayment2.isPaid();
        Models.Card card8 = cardPayment2.card;
        boolean boolean9 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (byte) 10, card1);
        boolean boolean3 = cardPayment2.processPayment();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.getCard();
        boolean boolean5 = cardPayment2.isPaid();
        boolean boolean6 = cardPayment2.processPayment();
        boolean boolean7 = cardPayment2.processPayment();
        boolean boolean8 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass9 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.isPaid();
        Models.Card card6 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        boolean boolean9 = cardPayment2.processPayment();
        boolean boolean10 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.getCard();
        Models.Card card6 = cardPayment2.getCard();
        Models.Card card7 = null;
        cardPayment2.card = card7;
        boolean boolean9 = cardPayment2.isPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 0, card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = cardPayment2.card;
        boolean boolean5 = cardPayment2.isPaid();
        java.lang.Class<?> wildcardClass6 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 10L, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        Models.Card card5 = cardPayment2.card;
        boolean boolean6 = cardPayment2.isPaid();
        boolean boolean7 = cardPayment2.processPayment();
        boolean boolean8 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) 'a', card1);
        boolean boolean3 = cardPayment2.isPaid();
        boolean boolean4 = cardPayment2.isPaid();
        Models.Card card5 = null;
        cardPayment2.card = card5;
        Models.Card card7 = cardPayment2.card;
        boolean boolean8 = cardPayment2.processPayment();
        boolean boolean9 = cardPayment2.processPayment();
        boolean boolean10 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((-1.0f), card1);
        Models.Card card3 = cardPayment2.card;
        Models.Card card4 = cardPayment2.card;
        Models.Card card5 = null;
        cardPayment2.card = card5;
        boolean boolean7 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) '#', card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        boolean boolean3 = cardPayment2.isPaid();
        Models.Card card4 = null;
        cardPayment2.card = card4;
        Models.Card card6 = cardPayment2.getCard();
        java.lang.Class<?> wildcardClass7 = cardPayment2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (short) -1, card1);
        Models.Card card3 = null;
        cardPayment2.card = card3;
        boolean boolean5 = cardPayment2.processPayment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Models.Card card1 = null;
        HelperFunctions.CardPayment cardPayment2 = new HelperFunctions.CardPayment((float) (-1L), card1);
        Models.Card card3 = cardPayment2.card;
        boolean boolean4 = cardPayment2.isPaid();
        boolean boolean5 = cardPayment2.processPayment();
        Models.Card card6 = cardPayment2.card;
        Models.Card card7 = cardPayment2.getCard();
        Models.Card card8 = cardPayment2.getCard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(card8);
    }
}

