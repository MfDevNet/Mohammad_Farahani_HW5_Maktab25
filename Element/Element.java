package Element;

public abstract class Element {
    // variable
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;
    // constructor
    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    //block method setter getter
    public String getSymbol() {
        return symbol;
    }
    public int getAtomicNumber() {
        return atomicNumber;
    }
    public double getAtomicWeight() {
        return atomicWeight;
    }
    // method abstract  describeElement no body
    public abstract String describeElement();
}
