public class Length {
    private String meters;
    private String centimeters;
    private String millimeters;

    public Length() {}

    public Length(String meters, String centimeters, String millimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
        this.millimeters = millimeters;
    }

    public String getMeters() {
        return meters;
    }

    public void setMeters(String meters) {
        this.meters = meters;
        if (this.meters == "") {
            this.meters = null;
        } else {
            this.meters = meters;
        }
    }

    public String getCentimeters() {
        return centimeters;
    }

    public void setCentimeters(String centimeters) {
        this.centimeters = centimeters;
        if (this.centimeters == "") {
            this.centimeters = null;
        } else {
            this.centimeters = centimeters;
        }
    }

    public String getMillimeters() {
        return millimeters;
    }

    public void setMillimeters(String millimeters) {
        this.millimeters = millimeters;
        if (this.millimeters == "") {
            this.millimeters = null;
        } else {
            this.millimeters = millimeters;
        }
    }
}
