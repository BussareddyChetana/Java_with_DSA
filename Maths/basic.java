public class basic{
  public static void main(String[] args) {
    int n = 123;
    System.out.println(CountDigits(n));
  }
  static int CountDigits(int n){
    //write code
    int count=0;
    while(n>0){
      count++;
      n=n/10;
    }
    return count;
  }
  
}