import java.util.Scanner;
abstract class Device {
    protected String br;

    Device(String br) {
        this.br = br;
    }

    abstract void turnOn();
}

interface RemoteControllable {
    void connectToWifi();
}

interface PowerSaving {
    int getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving {
    SmartTV(String br) {
        super(br);
    }

    public void turnOn() {
        System.out.println(br + " TV is booting ");
    }

    public void connectToWifi() {
        System.out.println("Connecting ");
    }

    public int getEnergyRating() {
        return 5;
    }
}

class ElectricKettle extends Device {
    ElectricKettle(String br) {
        super(br);
    }

    void turnOn() {
        System.out.println(br + " Kettle heating");
    }
}

public class SmartHome {
    public static void main(String[] args) {


        Device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

        Device k = new ElectricKettle("Philips");
        k.turnOn();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brand of electronics: ");
        String s = sc.next();
        Device d1 = new ElectricKettle(s);
        d1.turnOn();
    }
}