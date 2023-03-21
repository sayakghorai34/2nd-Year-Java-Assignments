public class sumOFdigitsINnumber {
    public static void main(String[] args) {
        int n = 2234;
        String N= Integer.toString(n);
        char[] s = N.toCharArray();
        int sum=0;
        for(char num :s){
            int i = Integer.parseInt(Character.toString(num));
            sum = sum+i;
        }
        System.out.println("Sum of the digits in "+n+" is= "+sum);
    }
}
