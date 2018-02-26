public class Weight {
    private String kilograms;
    private String grams;
    private String milligrams;

    public Weight() {}

    public Weight(String kilograms, String grams, String milligrams) {
        this.kilograms = kilograms;
        this.grams = grams;
        this.milligrams = milligrams;
    }

    public String getKilograms() {
        return kilograms;
    }

    public void setKilograms(String kilograms) {
        this.kilograms = kilograms;
        if (this.kilograms == "") {
            this.kilograms = null;
        } else {
            this.kilograms = kilograms;
        }
    }

    public String getGrams() {
        return grams;
    }

    public void setGrams(String grams) {
        this.grams = grams;
        if (this.grams == "") {
            this.grams = null;
        } else {
            this.grams = grams;
        }
    }

    public String getMilligrams() {
        return milligrams;
    }

    public void setMilligrams(String milligrams) {
        this.milligrams = milligrams;
        if (this.milligrams == "") {
            this.milligrams = null;
        } else {
            this.milligrams = milligrams;
        }
    }
}
