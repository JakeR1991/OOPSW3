class LightBulb {
    // states
    private boolean isOn;
    private int brightness;
    private String color;

    // methods
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setBrightness(int level) {
        brightness = level;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }
}
