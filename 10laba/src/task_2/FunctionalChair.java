package task_2;

/**
 * Функциональный стул, особенностью является метод, позволяющий сравнить два числа
 */
public class FunctionalChair implements Chair{

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
