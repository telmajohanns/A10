package is.hi.hbv202g.ass9.compositeObserved;

public class NumberLeaf extends Observable implements MathExpression {
  private int number;

  public NumberLeaf(int number) {
    this.number = number;
  }

  @Override
  public int getResult() {
    return number;
  }

  public void setValue(int number) {
    this.number = number;
    notifyObservers();
  }
}
