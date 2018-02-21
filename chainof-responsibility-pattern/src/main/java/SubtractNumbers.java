public class SubtractNumbers implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void calculate(CalculationRequest request) {
        if ("sub".equals(request.getCalculationComman())) {
            System.out.println("Subtract Result:" +
                    (request.getNumber1() - request.getNumber2()));
        } else {
            this.nextChain.calculate(request);
        }
    }
}
