package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends CompositeTemplate {

    @Override
    public int getResult() {
        int product = 1;
        for (MathExpression child : children) {
            product = operate(product, child.getResult());
        }
        return product;
    }

    @Override
    protected int operate(int a, int b) {
        return a * b;
    }
}
