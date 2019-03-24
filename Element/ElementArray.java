package Element;

public class ElementArray {

    public static void main(String[] args) {
        Element[] elements = new Element[5];
        // assigment data to array
        elements[0] = new MetalElement("B", 5, 55.845);
        elements[1] = new NonMetalElement("Si", 14, 4.002602);
        elements[2] = new NonMetalElement("Ga", 32, 15.9994);
        elements[3] = new MetalElement("TI", 81, 196.96657);
        elements[4] = new MetalElement("Nh", 113, 63.546);
            // display array
        for(int i = 0; i < elements.length; i++) {
            System.out.println(elements[i].describeElement());
        }
    }
}
