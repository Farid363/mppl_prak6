package figure.calculation;

import interfaces.ThreeDimensionalFigure;
import lib.MathOperation;

public class CubeOperation extends MathOperation implements ThreeDimensionalFigure {
    private Double sides = -1.0;

    public CubeOperation(Double sides){
        this.sides = sides;
    }

    @Override
    public Double volume() {
        return super.count(MathOperation.operator.MULTIPLY, sides, sides, sides);
    }

    public Double lateralLength() {
        // Cube Constant
        Double lateralCount = 12.0;
        return super.count(MathOperation.operator.MULTIPLY, sides, lateralCount);
    }
}