public class CalcLength {
    private Length length;
    private double meters;
    private double centimeters;
    private double millimeters;

    public void calcMeters(Length length) {
        if ((length.getMeters()) != null) {
            centimeters = Double.parseDouble(length.getMeters()) * 100;
            millimeters = Double.parseDouble(length.getMeters()) * 1000;
            length.setCentimeters(String.valueOf(centimeters));
            length.setMillimeters(String.valueOf(millimeters));
        } else if ((length.getCentimeters()) != null) {
            meters = Double.parseDouble(length.getCentimeters()) / 100;
            millimeters = Double.parseDouble(length.getCentimeters()) * 10;
            length.setMeters(String.valueOf(meters));
            length.setMillimeters(String.valueOf(millimeters));
        }else if ((length.getMillimeters()) != null) {
            meters = Double.parseDouble(length.getMillimeters()) / 1000;
            centimeters = Double.parseDouble(length.getMillimeters()) / 10;
            length.setMeters(String.valueOf(meters));
            length.setCentimeters(String.valueOf(centimeters));
        }
    }
}
