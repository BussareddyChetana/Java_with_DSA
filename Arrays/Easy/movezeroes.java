package Arrays.Easy;

public class movezeroes {
  public static void main(String[] args) {
      int[] arr={1,0,2,0,3,0,4};
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
          swap(arr,i,j);
          j++;
        }
      }
      for(int num : arr){
            System.out.print(num + " ");
      }
  }

  public static void swap(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
}
