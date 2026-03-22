package  Arrays.Easy;
public class LargestNumber {
  public static void main(String[] args) {
      int n[]={1,100,20,55,78};
      System.out.println(largest(n));
  }  
  public static int largest(int[] n){
    int max=0;
    for(int i=0;i<n.length;i++){
      if(n[i]>max){
        max=n[i];
      }
    }
    return max;
  }

}
