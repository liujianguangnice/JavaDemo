package keven.com.Enum;

/**
 * author:81486
 * Data:2019/1/29 15:41
 * Description:
 */


public enum Operator {

    ADD("+") {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }

    },
    SUBTRACT("-") {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public int calculate(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("divisor must not be 0");
            }
            return a / b;
        }
    };

    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public abstract int calculate(int a, int b);

    public String getOperator() {
        return operator;
    }

}




