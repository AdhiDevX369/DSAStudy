public class SearchingTechniques {

    public static void main(String[] args) {
        int nums[] = {1,5,6,8,9,12,11};
        int target = 11;
        int result = linearSearch(nums, target);
        int result2 = binerySearch(nums, target);

        if(result == -1)
            System.out.println("Index Not Found");
        else
            System.out.println("Index found at Linear: "+result);
        if(result2 == -1)
            System.out.println("Index Not Found");
        else
            System.out.println("Index found at Binery: "+result);

    }


    public static int binerySearch(int[] nums, int target) {
        int left = 0;
        int right =nums.length - 1;

        while(left<= right){
           int mid = (left + right)/2;

           if (nums[mid] == target){
               return mid;
           }
           else if(mid<target){
               left = mid + 1;
           }else {
               right = mid - 1;
           }
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i<nums.length; i++){
            if (nums[i] == target)
            return i;
        }
        return -1;
    }
}
