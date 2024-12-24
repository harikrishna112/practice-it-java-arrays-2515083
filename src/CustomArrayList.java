import java.util.Arrays;

public class CustomArrayList<D> {
  private int size =0;
  private static final int DEFAULT_CAPACITY =2;
  private Object[] elements;

  public CustomArrayList(){
    elements = new Object[DEFAULT_CAPACITY];
  }
  public D get(int i) {
    if(i >= size || i<0){
       throw new IndexOutOfBoundsException("Index :"+i+" size : "+size);
    }
    return (D)elements[i];
  }

  public void add(D item){
    if(size == elements.length){
      incrementCapacity();
    }
    elements[size] = item;
    size++;
  }
  public int size() {
    return size;
  }
  private void incrementCapacity(){
    int new_size=elements.length * 2;
    elements = Arrays.copyOf(elements, new_size);
  }
  public static int getDefaultCapacity() {
    return DEFAULT_CAPACITY;
  }
  public Object[] getElements() {
    return elements;
  }
  public void setElements(Object[] elements) {
    this.elements = elements;
  }
}
