package Element;

public class NonMetalElement extends Element {

    // constructor 3 parameter
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }
    // override method describeElement in super class
    @Override
    public String describeElement() {
        return(super.getSymbol() + "non-metal. atomic number:" + super.getAtomicNumber() + " weight: " + super.getAtomicWeight() );
    }
}
