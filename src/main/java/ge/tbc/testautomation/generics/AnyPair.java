package ge.tbc.testautomation.generics;

public class AnyPair <K,D>{
    private K elementOne;
    private D elementTwo;

    public AnyPair(K elementOne, D elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }



    public K getElementOne() {
        return elementOne;
    }

    public void setElementOne(K elementOne) {
        this.elementOne = elementOne;
    }

    public D getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(D elementTwo) {
        this.elementTwo = elementTwo;
    }

    @Override
    public String toString() {
        return "AnyPair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }


}
