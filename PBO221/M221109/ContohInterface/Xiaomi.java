package PBO221.M221109.ContohInterface;

public class Xiaomi implements Phone {

    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        isPowerOn = true;

        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di XIAOMI");
        System.out.println("Android version 29");
    }

    @Override
    public void powerOff() {
        // TODO Auto-generated method stub

        isPowerOn = false;

        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub

        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub

        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}
