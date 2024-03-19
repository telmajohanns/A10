package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
  private List<MathExpression> children = new ArrayList<MathExpression>();
  private int lastObservedResult;

  public void add(MathExpression expression) {
    if (expression instanceof Observable) {
      ((Observable) expression).attach(this);
    }
    children.add(expression);
  }

  public void remove(MathExpression expression) {
    children.remove(expression);
  }

  public List<MathExpression> getChildren() {
    return children;
  }

  @Override
  public int getResult() {
    int product = 1;

    for (int i = 0; i < children.size(); i++) {
      product *= children.get(i).getResult();
    }
    return product;
  }

  public void update() {
    lastObservedResult = getResult();
    System.out.println(lastObservedResult);
  }

  public int getLastObservedResult() {
    return lastObservedResult;
  }
}
