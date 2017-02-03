import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gorshkov on 24.01.2017.
 */
public class TestLambda {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        String plusSign = " + ";
        String minusSign = " - ";
        String powSign = " ^ ";
        String equalsSign = " = ";

        Map<String, Operation> operations = new HashMap<>();

        operations.put(plusSign, new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });
        operations.put(minusSign, (a, b) -> a - b);
        operations.put(powSign, (a, b) -> (int) Math.pow(a, b));

        Set<String> keySet = operations.keySet();
        for (String sign : keySet) {
            int result = solve(x, y, operations.get(sign));
            System.out.println(x + sign + y + equalsSign + result);
        }
    }

    private static int solve(int x, int y, Operation operation) {
        return operation.operate(x, y);
    }
}

@FunctionalInterface
interface Operation {
    int operate(int x, int y);
}





