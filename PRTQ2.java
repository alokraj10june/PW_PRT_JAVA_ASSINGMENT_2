package ASSINGMENT_2PRT;
import java.lang.reflect.Array;
import java.util.Arrays;
public class PRTQ2{
        static int distributeCandies(int[] candyType) {
            // We start by sorting candyType.
            Arrays.sort(candyType);
            // The first candy is always unique.
            int uniqueCandies = 1;
            // For each candy, starting from the second candy...
            for (int i = 1; i < candyType.length && uniqueCandies < candyType.length / 2; i++) {
                // This candy is unique if it is different to the one
                // immediately before it.
                if (candyType[i] != candyType[i - 1]) {
                    uniqueCandies++;
                }
            }
            // Like before, the answer is the minimum out of the number of unique
            // candies, and half the length of the candyType array.
            return Math.min(uniqueCandies, candyType.length / 2);
        }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        System.out.println(distributeCandies(arr));
    }
    }

