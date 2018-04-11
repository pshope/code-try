public class Client {
    public static void main(String[] args) {
        Chain addNumbers = new AddNumbers();
        Chain subtractNumbers = new SubtractNumbers();
        addNumbers.setNextChain(subtractNumbers);
        subtractNumbers.setNextChain(addNumbers);

        addNumbers.calculate(new CalculationRequest(1,1,"sub"));
        subtractNumbers.calculate(new CalculationRequest(1,1,"add"));



    }
}
