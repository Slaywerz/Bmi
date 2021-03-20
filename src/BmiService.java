public class BmiService {
    public double calculate(double weight, double growth) {
        double bmi;
        boolean m = 2.72 < growth;

        if (m) {
            double cmToM = growth / 100;
            bmi = weight / (cmToM * cmToM);

        } else {
            bmi = weight/ (growth * growth);
        }

        return bmi;
    }

}
