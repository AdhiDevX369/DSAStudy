public class SortingTechniques {

    /*Bubble Sort

    public static void main(String[] args) {
        int nums[] = {5, 6, 2, 4, 3, 1, 9, 8, 7};
        int size = nums.length;
        int temp = 0;
        int steps = 0;
        System.out.println("Before Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < size; i++) {
            steps++;
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }
            }
        }

        System.out.println();

        System.out.println("After Sorted with "+steps+ " Steps");
        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
}
//Seleaction Sort
    public static void main(String[] args) {
        int nums[] = {5, 6, 2, 4, 3, 1, 9, 8, 7};
        int size = nums.length;
        int temp = 0;
        int steps = 0;
        int minIndex = -1;

        System.out.println("Before Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i; j < size; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}*/

 //Insertion Sort
    public static void main(String[] args) {
        int nums[] = {5, 6, 2, 4, 3, 1, 9, 8, 7};
        int size = nums.length;


        System.out.println("Before Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i<size; i++ ){
            int key = nums[i];
            int j = i -1;

            while (j>=0 && nums[j]> key ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] =key;
        }
        System.out.println();
        System.out.println("After Sorted");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}


