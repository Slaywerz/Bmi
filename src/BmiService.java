public class BmiService {
    public double calculate(double weight, double growth) {
        double Bmi;
        boolean m = 2.72 < growth;

        if (m) {
            double CmToM = growth / 100;
            Bmi = weight / (CmToM * CmToM);

        } else {
            Bmi = weight/ (growth * growth);
        }

        return Bmi;
    }

}
