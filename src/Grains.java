import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square >= 1 && square <= 64) {
            BigInteger bigi = BigInteger.TWO;
            return bigi.pow(square - 1);
        } else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger bigi2 = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++){
            bigi2 = bigi2.add(grainsOnSquare(i));
        }
        return bigi2;
    }
}
