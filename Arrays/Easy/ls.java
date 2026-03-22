package Arrays.Easy;

public class ls {
  public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      System.out.println(ls(arr));
  }
  public static int ls(int arr[]){
    int key=5;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
        return i;
      }
    }
    return -1;
  }
}
