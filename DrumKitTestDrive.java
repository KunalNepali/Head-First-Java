public class DrumKitTestDrive {

    public static void main(String [] args) {

        DrumKit d = new DrumKit();

        if(d.snare) {
            d.playSnare();
        }

        d.snare = false;
        d.playTopHat();

}
}