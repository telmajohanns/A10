package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
  private List<MathExpression> children = new ArrayList<>();

  public void add(MathExpression expression) {
      children.add(expression);
  }

  @Override
  public int getResult() {
      int sum = 0;
      for (int i = 0; i < children.size(); i++) {
          sum += children.get(i).getResult();
      }
      return sum;
  }
}
