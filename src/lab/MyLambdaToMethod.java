package lab;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

/**
 * todo Document type MyLambdaToMethod
 */
public class MyLambdaToMethod {

    private static DoubleBinaryOperator calculateRectangleAreaLambda = (a, b) -> a * b;
    private DoubleBinaryOperator calculateTriangleArea = (a, b) -> a * b;
    private DoubleBinaryOperator getMaxOfTwoNumbers = Math::max;
    private DoubleBinaryOperator getMaxOfTwoNumbersVariantTwo = (a, b) -> a > b ? a : b;


    public double manipulateData(double[] arr, DoubleBinaryOperator doubleBinaryOperator) {
        if (arr == null || arr.length != 2 || doubleBinaryOperator == null) {
            throw new IllegalArgumentException();
        }
        return doubleBinaryOperator.applyAsDouble(arr[0], arr[1]);
    }

    public static void main(String[] args) {
        MyLambdaToMethod myLambdaToMethod = new MyLambdaToMethod();
        double rectangleArea = myLambdaToMethod.manipulateData(new double[]{1.1, 2.2}, calculateRectangleAreaLambda);
        double triangleArea = myLambdaToMethod.manipulateData(new double[]{1.1, 2.2}, myLambdaToMethod.calculateTriangleArea);
        double maxOfTwo = myLambdaToMethod.manipulateData(new double[]{1.1, 2.2}, myLambdaToMethod.getMaxOfTwoNumbers);

    }
}
