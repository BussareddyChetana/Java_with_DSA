package Arrays.Easy;

public class sorted {
  public static void main(String[] args) {
      int nums[]={1,2,3,4,5};
      System.out.println(sorted(nums));
  }
  public static boolean sorted(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]>=nums[(i+1)%nums.length]){
        count++;
      }
    }
    return count<=1;
      
  }
}
