public class CNPM_BMI {
    public static int calculateBMI(double height, double weight) {
        final int THIEU_CAN = 0;
        final int BINH_THUONG = 1;
        final int THUA_CAN = 2;
        final int BEO_PHI = 3;
        final int KHONG_HOP_LE = -1;
        if(height <= 0.00 || height > 3.00 || weight < 0.0 || weight > 500.0)
        {
            return KHONG_HOP_LE;
        }

        double bmi = (weight / (height * height));

        if (bmi < 18.50) {
            return THIEU_CAN;
        }
        if (bmi >= 18.50 && bmi <= 22.99) {
            return BINH_THUONG;
        }
        if (bmi >= 23.00 && bmi <= 24.99) {
            return THUA_CAN;
        }
        if (bmi >= 25.00) {
            return BEO_PHI;
        }
        return 0;
    }
}
