public class Main {

        public static int add(int x, int y) {
        return x + y;
    }
        public static int subtract(int x, int y) {
        return x - y;
    }

        public static void main(String[] args) {
        int a = add(4, 6);
        int b = add(9, 3);
        int c = add(4, 7);
        int v = subtract(8, 7);
        int q = subtract(7, 4);
        int w = subtract(8, 2);
        int[] additionResults = {a, b, c};
        int[] subtractionResults = {v, q, w};
        for (int i = 0; i < additionResults.length; i++) {
            if (additionResults[i] % 2 == 0) {
                System.out.println(additionResults[i] + " is even ");
            } else System.out.println(additionResults[i] + " is odd ");
        }
        for (int i = 0; i < subtractionResults.length; i++) {
            if (subtractionResults[i] % 2 == 0) {
                System.out.println(subtractionResults[i] + " is even ");
            } else System.out.println(subtractionResults[i] + " is odd ");
        }
        int i = 0;
        while (i < additionResults.length) {
            if (additionResults[i] % 2 == 0) {
                System.out.print(additionResults[i] + " is even, ");
            } else {
                System.out.print(additionResults[i] + " is odd, ");
            }
            i++;
        }

        int j = 0;
        while (j < subtractionResults.length) {
            if (subtractionResults[j]%2 ==0) {
                System.out.print(subtractionResults[j] + " is even,  ");
            }
            else {
                System.out.print(subtractionResults[j] + " is odd, ");
            }

            j++;

        }

    }
}
