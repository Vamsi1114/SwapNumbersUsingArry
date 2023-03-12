import java.util.*;  
class SwapNumber {  
    public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements you want to store:");
      int n=sc.nextInt();
      int arr[]= new int[n];
      System.out.println("Enter the numbers you want to store:");

      for(int i=0; i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Before swapping first and last digit:");

      for(int c:arr) {
          System.out.println(c);
        }
      int temp=arr[0];
      arr[0]=arr[n-1];
      arr[n-1]=temp;
      System.out.println("After swapping first and last digit:");

      for(int s:arr) {
          System.out.println(s);
        }
    } 
}
