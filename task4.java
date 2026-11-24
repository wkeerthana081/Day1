class Device{
    String powerSource;
    public void turnOn(){
        System.out.println("Device Powered On");
    }
}
class Mobile extends Device{
    double screenSize;
    public void makeCall(){
        System.out.println("Making a call");
    }
}
class Android extends Mobile{
    public void openPlayStore(){
        System.out.println("Opening Play Store");
    }
}
class iPhone extends Mobile{
    public void openAppStore(){
        System.out.println("Opening App Store");
    }
}
public class task4 {
    public static void main(String[] args){
        Android a = new Android();
        a.powerSource = "battery";
        a.screenSize = 6.5;
        System.out.println("Android");
        a.turnOn();
        a.openPlayStore();
        iPhone i = new iPhone();
        i.powerSource = "battery";
        i.screenSize = 5.8;
        System.out.println("iPhone");
        i.turnOn();
        i.makeCall();
        i.openAppStore();
        Device d = new Device();
        Mobile m = new Mobile();
    }
}
