import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    /*
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    Код выдавал ошибку по той причине, что отсутствовала проверка на ноль для У.
     */

    BinaryOperator<Integer> divide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException exception) {
            System.out.print("На ноль делить нельзя! Y = ");
            return y;
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
