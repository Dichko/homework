public class Exercise14 {
        public static void main(String[] args) {
            int len = 5;
            int initialValue = 3;
            int[] resultArray = mainArg(len, initialValue);
            for (int value : resultArray) {
                System.out.print(value + " ");
            }
        }
        public static int[] mainArg(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }
    }
