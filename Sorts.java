import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {
    int last = data.length;
    for(int j = 0; j < data.length; j++){
      for(int i = 0; i < last-1; i++) {
        System.out.println(Arrays.toString(data));
        int a = data[i];
        int b = data[i+1];
        if(a > b) {
          data[i] = b;
          data[i+1] = a;
        }
      }
    last--;
    }
  }

  public static void selectionSort(int[] data) {
    for(int i = 0; i < data.length; i++) {
      int og = data[i];
      int min = data[i];
      int minIndex = i;
      for(int j = i; j < data.length; j++) {
        if(data[j] < min) {
          min = data[j];
          minIndex = j;
        }
      }
      data[i] = min;
      data[minIndex] = og;
      System.out.println(Arrays.toString(data));
    }
  }

}
