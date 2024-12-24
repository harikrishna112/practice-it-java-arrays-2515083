import java.util.Arrays;

public class App {

  private static void printTriangle(Object[] arr){
    for(int row=arr.length-1;row >=0 ;row--){
      for(int col=0;col<row;col++){
        System.out.print(arr[col]);
      }
      System.out.println();
    }
    System.out.println();
  }

  private static Object[] rotateRight(Object[] arr){
    if(arr == null){
      return null;
    }
    Object[] result = new Object[arr.length];
    for(int i=0;i<arr.length;i++){
      result[(i+1) % result.length] = arr[i];
    }
    return result;
  }
  
  public static void main(String[] args) {
    Object[]  arr = new Integer[] {12,23,34,45,56};
    printTriangle(arr);
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
  }
}