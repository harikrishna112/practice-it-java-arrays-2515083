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
//reverse the elements from the original arr
  private static Object[] reverseArray(Object[] arr){
    for(int i=0;i < arr.length / 2;i++){
      Object temp = (Object) arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-i-1] = temp;
    }
    return arr;
  }
  
  public static void main(String[] args) {
    Object[]  arr = new Integer[] {12,23,34,45,56};
    
    printTriangle(arr);
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = reverseArray(arr);
    System.out.println(Arrays.toString(arr));
    arr = new String[] { "HARI", "KRISHNA", "RESHMA" };
    arr = reverseArray(arr);
    System.out.println(Arrays.toString(arr));
  }
}