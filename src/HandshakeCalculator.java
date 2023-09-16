import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binaryString = Integer.toBinaryString(number);
        if(binaryString.length() > 5){
            binaryString = binaryString.substring(binaryString.length() -5);
        }
        String binary = String.format("%05d", Integer.parseInt(binaryString));
        List<Signal> signals = new ArrayList<>();
        for (int i = binary.length()-1; i >= 0; i--) {
            if(binary.charAt(i) == '1'){
                switch (i) {
                    case 4 -> signals.add(Signal.WINK);
                    case 3 -> signals.add(Signal.DOUBLE_BLINK);
                    case 2 -> signals.add(Signal.CLOSE_YOUR_EYES);
                    case 1 -> signals.add(Signal.JUMP);
                    case 0 -> signals.sort(Comparator.reverseOrder());
                }
            }
        }
        return signals;
    }
}
enum Signal {

    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP

}
