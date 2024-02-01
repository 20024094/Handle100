package handle1000numbers;

import java.util.Arrays;

/**
 *
 * @author 20024094
 */
public class Handle1000numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] intArray = new int[100];
      for(int i=0; i<100; i++) {
         intArray[i] = i;
      }
      System.out.println(Arrays.toString(intArray));
    }
    
}
