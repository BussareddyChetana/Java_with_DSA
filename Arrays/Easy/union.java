package Arrays.Easy;
import java.util.ArrayList;
import java.util.TreeSet;
public class union {
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int[] b = {1,5,6,7,9};
    System.out.println(union(a, b));
  }

      public static ArrayList<Integer> union(int a[],int b[]){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<a.length;i++){
          set.add(a[i]);

        }
        for(int i=0;i<b.length;i++){
          set.add(b[i]);
        } 
      return new ArrayList<Integer>(set);
      }
}
