public class CalcWeight {
    private Weight weight;
    private double kilograms;
    private double grams;
    private double milligrams;

    public void calcKilograms(Weight weight) {
        if ((weight.getKilograms()) != null) {
            grams = Double.parseDouble(weight.getKilograms()) * 1000;
            milligrams = Double.parseDouble(weight.getKilograms()) * 1000000;
            weight.setGrams(String.valueOf(grams));
            weight.setMilligrams(String.valueOf(milligrams));
        } else if ((weight.getGrams()) != null) {
            kilograms = Double.parseDouble(weight.getGrams()) / 1000;
            milligrams = Double.parseDouble(weight.getGrams()) * 1000;
            weight.setKilograms(String.valueOf(kilograms));
            weight.setMilligrams(String.valueOf(milligrams));
        }else if ((weight.getMilligrams()) != null) {
            kilograms = Double.parseDouble(weight.getMilligrams()) / 1000000;
            grams = Double.parseDouble(weight.getMilligrams()) / 1000;
            weight.setKilograms(String.valueOf(kilograms));
            weight.setGrams(String.valueOf(grams));
        }
    }
}
