import org.junit.Test;
import static org.junit.Assert.*;

public class CNPM_BMI_TEST {

    @Test
    public void test_PHTD_VAO_1() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(-2.71, 247.3);
        assertEquals(-1, out);
    }
    @Test
    public void test_PHTD_VAO_2() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.62, 696.9);
        assertEquals(-1, out);
    }
    @Test
    public void test_PHTD_VAO_3() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.62, 247.3);
        assertEquals(3, out);
    }
    @Test
    public void test_PHTD_RA_1() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.87, 50.0);
        assertEquals(0, out);
    }
    @Test
    public void test_PHTD_RA_2() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.91, 68.7);
        assertEquals(1, out);
    }
    @Test
    public void test_PHTD_RA_3() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.82, 81.2);
        assertEquals(2, out);
    }
    @Test
    public void test_PHTD_RA_4() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.67, 75.6);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_VAO_1() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(0.00, 250.0);
        assertEquals(-1, out);
    }
    @Test
    public void test_GTB_VAO_2() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(3.00, 250.0);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_VAO_3() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.50, 0.0);
        assertEquals(0, out);
    }
    @Test
    public void test_GTB_VAO_4() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.50, 500.0);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_VAO_5() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.50, 250.0);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_BMI_1() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.00, 18.5);
        assertEquals(1, out);
    }
    @Test
    public void test_GTB_BMI_2() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(2.00, 92.0);
        assertEquals(2, out);
    }
    @Test
    public void test_GTB_BMI_3() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(3.00, 225.0);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_BMI_4() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(1.45, 0.0);
        assertEquals(0, out);
    }
    @Test
    public void test_GTB_BMI_5() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(0.01, 500.0);
        assertEquals(3, out);
    }
    @Test
    public void test_GTB_BMI_6() {
        CNPM_BMI test = new CNPM_BMI();
        int out = test.calculateBMI(0.01, 250.0);
        assertEquals(3, out);
    }
}
