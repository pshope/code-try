public class AddNumbers implements Chain {

    Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void calculate(CalculationRequest request) {
        if ("add".equals(request.getCalculationComman())) {
            System.out.println("Adding Result:" +
                    (request.getNumber1() + request.getNumber2()));
        } else {
            this.nextChain.calculate(request);
        }
    }
}
