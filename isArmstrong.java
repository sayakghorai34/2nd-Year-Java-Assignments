
public class isArmstrong {
    public static void main(String[] args) {
        int m = 1;
        for(int n=1;n<=500;n++){
        String N= Integer.toString(n);
        char[] s = N.toCharArray();
        int size=s.length,sum=0;
        for(char num:s){
            int temp=1;
            int i = Integer.parseInt(Character.toString(num));
            for(int j =0;j<=size-1;j++){
                temp = temp*i;
            }
            sum+=temp;
        }
            
        if(sum==Integer.valueOf(n)){
            System.out.println(m+"'th Armstrong Number is: "+sum);
            m+=1;
        }

    }
}
}
