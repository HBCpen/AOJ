package ITP2.ITP2_1_A;

import java.util.ArrayList;
import java.util.Scanner;

public class refactor {
    private static final int PUSH_BACK = 0;
    private static final int RANDOM_ACCESS = 1;
    private static final int POP_BACK = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();

        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            int operation = scanner.nextInt();

            switch (operation) {
                case PUSH_BACK:
                    int value = scanner.nextInt();
                    pushBack(vector, value);
                    break;

                case RANDOM_ACCESS:
                    int position = scanner.nextInt();
                    randomAccess(vector, position);
                    break;

                case POP_BACK:
                    popBack(vector);
                    break;

                default:
                    System.err.println("Unexpected operation: " + operation);
                    break;
            }
        }

        scanner.close();
    }

    private static void pushBack(ArrayList<Integer> vector, int value) {
        vector.add(value);
    }

    private static void randomAccess(ArrayList<Integer> vector, int position) {
        System.out.println(vector.get(position));
    }

    private static void popBack(ArrayList<Integer> vector) {
        if (!vector.isEmpty()) {
            vector.remove(vector.size() - 1);
        }
    }
}