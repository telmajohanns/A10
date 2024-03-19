package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends CompositeTemplate {

    @Override
    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            sum = operate(sum, child.getResult());
        }
        return sum;
    }

    @Override
    protected int operate(int a, int b) {
        return a + b;
    }
}