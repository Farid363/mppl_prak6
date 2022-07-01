package figure.calculation;

import interfaces.ThreeDimensionalFigure;
import lib.MathOperation;

public class BlockOperation extends MathOperation implements ThreeDimensionalFigure {
    private Double width = 0.0, length = 0.0, height = 0.0;

    public BlockOperation(Double width, Double length, Double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public Double volume() {
        return super.count(MathOperation.operator.MULTIPLY, width, length, height);
    }
}
