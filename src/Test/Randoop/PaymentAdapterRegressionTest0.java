package Test.Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentAdapterRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        java.lang.Class<?> wildcardClass2 = paymentAdapter1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = paymentAdapter1.validatePayment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.isPaid()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = paymentAdapter1.getPaymentStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.isPaid()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment(1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        DesignPatterns.PaymentMethod paymentMethod0 = null;
        DesignPatterns.PaymentAdapter paymentAdapter1 = new DesignPatterns.PaymentAdapter(paymentMethod0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentAdapter1.processPayment((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"DesignPatterns.PaymentMethod.processPayment()\" because \"this.paymentMethod\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

