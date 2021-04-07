public class PhoneTester {
    public static void main(String[] args) {
        IPhone iphoneTen = new IPhone("X", 95, "AT&T", "Bzzzz Bzzzzz");
        Galaxy s20 = new Galaxy("S20 Plus", 100, "Verizon", "Ring Ring Ring");
        s20.displayInfo();
        s20.ring();
        s20.unlock();
        s20.setBatteryPercentage(70);
        s20.getBatteryPercentage();
        s20.setCarrier("T-Mobile");
        s20.getCarrier();
        s20.getVersionNumber();
        s20.setRingTone("Ringaling Ringaling");
        s20.getRingTone();

        iphoneTen.displayInfo();
        iphoneTen.ring();
        iphoneTen.unlock();
        iphoneTen.setBatteryPercentage(55);
        iphoneTen.getBatteryPercentage();
        iphoneTen.setCarrier("Boost Mobile");
        iphoneTen.getCarrier();
        iphoneTen.getVersionNumber();
        iphoneTen.setRingTone("Answer your phone Answer your phone");
        iphoneTen.getRingTone();
    }
}
