public class MainLCD {
    public static void main(String[] args) {

        LCD L1 = new LCD();

        L1.turnOn();
        L1.setVolume(49);
        L1.volumeUp();
        L1.volumeUp();
        L1.Freeze();
        L1.volumeDown();
        L1.volumeUp();
        L1.setBrightness(39);
        L1.brightnessDown();
        L1.brightnessUp();
        L1.cableUp();
        L1.cableUp();
        L1.brightnessDown();
        L1.cableUp();

        L1.displayMessage();
        



        
        // LCD L2 = new LCD();

        // L2.Freeze();
        // L2.setVolume(51);
        // L2.setBrightness(38);
        // L2.cableUp();
        // L2.cableUp();
        // L2.cableUp();

        // L2.displayMessage();


    }
    
}
