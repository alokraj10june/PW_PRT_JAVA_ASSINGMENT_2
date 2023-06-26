package ASSINGMENT_2PRT;

import java.util.Arrays;

public class PRTQ1 {
        static int arrayPairSum(int[] nums) {
            Arrays.sort(nums);                //1,2,3,4
            int res=0;                         //res=0,1,4
            for(int i=0;i<nums.length;i+=2){    //i=0,2
                res+=nums[i];                   //res=0+1,1+3
            }
            return res;                          //4

        }

    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        System.out.println(arrayPairSum(nums));   //4
    }
    }

