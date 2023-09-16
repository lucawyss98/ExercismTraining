import java.util.Objects;

class Matrix {

    private final int[][] matrix;

    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("/n");
        matrix = new int[rows.length][rows.length];
        for (int i = 0; i< rows.length; i++){
            String[] numberStrings = rows[i].split(" ");
            int[] row= new int[numberStrings.length];
            for (int j=0; j < row.length; j++) {
                String num = numberStrings[j].trim();
                if(!Objects.equals(num, ""))
                    row[j] = Integer.parseInt(num);
            }
            matrix[i] = row;
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] result = new int[matrix.length];
        for (int i=0; i< matrix.length; i++){
            result[i] = matrix[i][columnNumber-1];
        }
        return result;
    }
}
