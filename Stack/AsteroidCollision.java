import java.util.*;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            boolean alive = true;

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {

                int top = stack.peek();

                if (top < -a) {
                    stack.pop(); // top dies, continue checking
                } 
                else if (top == -a) {
                    stack.pop(); // both die
                    alive = false;
                    break;
                } 
                else {
                    // top > -a → current dies
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.push(a);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};

        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}