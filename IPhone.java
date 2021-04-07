public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    public void ring() {
        System.out.println(getRingTone());
    }
    public void unlock() {
        System.out.println("Unlocking IPhone by face recognition");
    }
    public void displayInfo() {
        System.out.println("IPhone: " + getVersionNumber() + " Battery %: " + getBatteryPercentage() + " Carrier: " + getCarrier() + " RingTone: " +  getRingTone());
    }
}
