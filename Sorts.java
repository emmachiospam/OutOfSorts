import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {
    int last = data.length;
    for(int i = 0; i < data.length-1; i++) {
      int a = data[i];
      int b = data[i+1];
      if(a > b) {
        data[i] = b;
        data[i+1] = a;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {1,5,1,2,4,3};
    bubbleSort(nums);
    String test = Arrays.toString(nums);
    System.out.println(test);
  }

}
