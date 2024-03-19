package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
  private List<MathExpression> children = new ArrayList<>();

  public void add(MathExpression expression) {
    children.add(expression);
  }

  @Override
  public int getResult() {
    int product = 1;

    for (int i = 0; i < children.size(); i++) {
      product *= children.get(i).getResult();
    }
    return product;
  }
}
