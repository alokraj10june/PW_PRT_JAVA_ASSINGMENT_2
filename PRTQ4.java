
package ASSINGMENT_2PRT;
import java.util.Arrays;
public class PRTQ4 {
        static boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                // Check if the current plot is empty.
                if (flowerbed[i] == 0) {
                    // Check if the left and right plots are empty.
                    boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                    boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                    // If both plots are empty, we can plant a flower here.
                    if (emptyLeftPlot && emptyRightPlot) {
                        flowerbed[i] = 1;
                        count++;
                        if (count >= n) {
                            return true;
                        }
                    }
                }
            }
            return count >= n;
        }

    public static void main(String[] args) {
        int[] arr={1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(arr,n));
    }
    }


