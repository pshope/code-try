public class CalculationRequest {
    private int number1;
    private int number2;
    private String calculationComman;


    public CalculationRequest(int number1, int number2, String calculationComman) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationComman = calculationComman;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalculationComman() {
        return calculationComman;
    }

    public void setCalculationComman(String calculationComman) {
        this.calculationComman = calculationComman;
    }
}
