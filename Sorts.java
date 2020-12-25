import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {
    int last = data.length;
    for(int j = 0; j < data.length; j++){
      for(int i = 0; i < last-1; i++) {
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
      int orig = data[i];
      int min = data[i];
      int minIndex = i;
      for(int j = i; j < data.length; j++) {
        if(data[j] < min) {
          min = data[j];
          minIndex = j;
        }
      }
      data[i] = min;
      data[minIndex] = orig;
    }
  }

  public static void insertionSort(int[] data) {
    int movedValue = 0;
    int index = 0;
    for(int i = 1; i < data.length; i++) {
      if(data[i] < data[i-1]) {
        movedValue = data[i];
        int j = i-1;
        while(j >= 0 && movedValue < data[j]){
          data[j+1] = data[j];
          j = j-1;
        }
        data[j+1] = movedValue;
      }
    }
  }

}
