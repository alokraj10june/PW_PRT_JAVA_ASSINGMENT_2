package ASSINGMENT_2PRT;
public class PRTQ3 {
        static int findLHS(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                boolean flag = false;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == nums[i])
                        count++;
                    else if (nums[j] + 1 == nums[i]) {
                        count++;
                        flag = true;
                    }
                }
                if (flag)
                    res = Math.max(count, res);
            }
            return res;
        }

    public static void main(String[] args) {
        int[] arr={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(arr));
    }
    }

