package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeTemplate implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<>();
    protected int lastObservedResult;

    public void add(MathExpression expression) {
        if (expression instanceof Observable) {
            ((Observable) expression).attach(this);
        }
        children.add(expression);
    }

    @Override
    public abstract int getResult();

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println(getClass().getSimpleName() + " : " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    protected abstract int operate(int a, int b);
}