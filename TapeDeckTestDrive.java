public class TapeDeckTestDrive {
    public static void main(String[] args) {

        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true) {
            t.recordTape();
        }
    }
}
