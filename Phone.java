public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();
    public String getVersionNumber() {
        System.out.println(versionNumber);
        return versionNumber;
    }
    public int getBatteryPercentage() {
        System.out.println(batteryPercentage);
        return batteryPercentage;
    }
    public String getCarrier() {
        System.out.println(carrier);
        return carrier;
    }
    public String getRingTone() {
        System.out.println(ringTone);
        return ringTone;
    }
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }
}

