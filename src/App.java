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
  
  public static void main(String[] args) {
    Integer[]  arr =  {12,23,34,45,56};
    printTriangle(arr);
  }
}