public class Solve{
 public static int[] plusOne(int[] digits) {
        // convert to number (warning: may overflow for large inputs)
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];
        }

        System.out.println(num);
        num += 1;


        // convert back to array
        String str = Integer.toString(num);
        int[] res = new int[str.length()];

        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i) - '0';
        }

        return res;
    }

    public static void main(String [] arg){
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int res[] = plusOne(arr);

        for(int nu: res){
            System.out.print(nu);
        }
    }
}