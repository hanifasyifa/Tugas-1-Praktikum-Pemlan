public class LCD {
    private String status;
    private int volume;
    private int brightness;
    private String cableType;
    private int cableNumber;

    public void turnOff(){
        status = "Off";
    }

    public void turnOn() {
        status = "On";
    }

    public void Freeze() {
        status = "Freeze";
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void brightnessUp() {
        brightness++;
    }

    public void brightnessDown() {
        brightness--;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    
    public void cableUp(){
        this.cableNumber++;
        cableCheck();
        setCable();
    }

    public void cableDown(){
        this.cableNumber--;
        cableCheck();
        setCable();
    }

    public void cableCheck(){
        if (cableNumber < 1 || cableNumber > 4) {
            cableNumber = 3;
        }
    }

    public void setCable() {
        switch (cableNumber) {
            case 1:
                this.cableType = "VGA";
                break;
            case 2:
                this.cableType = "DIV";
                break;
            case 3:
                this.cableType = "HDMI";
                break;
            case 4:
                this.cableType = "DisplayPort";
                break;
            default:
                break;
        }
        
    }

    public void displayMessage() {
        System.out.println("LCD Status : " + this.status);
        System.out.println("Volume : " + this.volume);
        System.out.println("Brightness : " + this.brightness);
        System.out.println("Cable : " + this.cableType);
        System.out.println("");
    }

   


}