class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null)
            throw new IllegalArgumentException("Operation cannot be null");
        switch (operation) {
            case "+":
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            case "*":
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            case "/":
                try {
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                } catch (Exception e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}

class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}