public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public void ring() {
        System.out.println(getRingTone());
    }
    public void unlock() {
        System.out.println("Unlocking Galaxy by face recognition");
    }
    public void displayInfo() {
        System.out.println("Galaxy: " + getVersionNumber() + " Battery %: " + getBatteryPercentage() + " Carrier: " + getCarrier() + " RingTone: " +  getRingTone());
    }
}
