package Arrays.Easy;
public class sl {
  public static void main(String[] args) {
      int arr[]={1,20,55,68,200};
      System.out.println(slargest(arr));
  }
  public static int slargest(int arr[]){
    int max=arr[0];
    int sl=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        sl=max;
        max=arr[i];
      }else if(arr[i]>sl && arr[i]<max){
        sl=arr[i];
      }
    }return sl;
     
  }
}
