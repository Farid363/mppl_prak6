package lib;

public class MathOperation {
    public enum operator {
        ADD,
        SUBSTRACT,
        DIVIDE,
        MULTIPLY
    }

    private Double multiply(Double... nums) {
        if (nums.length < 1) {
            return 0.0;
        }

        Double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result *= nums[i];
        }

        return result;
    }

    private Double divide(Double... nums) {
        if (nums.length < 1) {
            return 0.0;
        }

        Double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result /= nums[i];
        }

        return result;
    }

    private Double add(Double... nums) {
        if (nums.length < 1) {
            return 0.0;
        }

        Double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result += nums[i];
        }

        return result;
    }

    private Double substract(Double... nums) {
        if (nums.length < 1) {
            return 0.0;
        }

        Double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result -= nums[i];
        }

        return result;
    }

    protected Double count(operator operator, Double... nums) {
        return switch (operator) {
            case ADD -> add(nums);
            case DIVIDE -> divide(nums);
            case SUBSTRACT -> substract(nums);
            case MULTIPLY -> multiply(nums);
        };

    }
}
