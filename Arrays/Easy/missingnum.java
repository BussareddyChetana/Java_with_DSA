package Arrays.Easy;

public class missingnum {
  public static void main(String[] args) {
      int nums[]={0,1,2,3,5,6,7};
      System.out.println(mn(nums));
  }
  public static int mn(int[] nums){
    int n=nums.length;
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=nums[i];
    }
    int sumofnaturalnum=n*(n+1)/2;
    return sumofnaturalnum-sum;
  }
}
