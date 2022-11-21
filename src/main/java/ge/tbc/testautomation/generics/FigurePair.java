package ge.tbc.testautomation.generics;

public class FigurePair <E,T> extends Figure{
    private E elementOne;
    private T elementTwo;

    public E getElementOne() {
        return elementOne;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public FigurePair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;


    }

    @Override
    public String toString() {
        return "FigurePair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }
}
