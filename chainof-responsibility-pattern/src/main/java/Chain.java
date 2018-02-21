public interface Chain {
    void setNextChain(Chain chain);

    void calculate(CalculationRequest request);
}
