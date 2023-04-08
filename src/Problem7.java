public class Problem7 {
        /**
         * @ reverse - a set of statements that reverses the elements of an array between the given start and end indices.
         * @ arr the array to be reversed
         * @ start the starting index of the portion to be reversed
         * @ end the ending index of the portion to be reversed
         */
        public static void reverse(int[] arr, int start, int end) {
            if (end <= start) { //base case
                for (int j : arr) {
                    System.out.print(j + " ");
                }

            } else { //recursive case
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                reverse(arr, start + 1, end - 1);
            }
        }
}
