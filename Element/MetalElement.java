package Element;


public class MetalElement extends Element {

    // constructor with 3 parameter
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    // override method describeElement in super class
    @Override
    public String describeElement() {
        return(super.getSymbol() + " metal . atomic number :" + super.getAtomicNumber() + " weight:" + super.getAtomicWeight() );
    }

}
