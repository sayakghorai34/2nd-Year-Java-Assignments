public class q13{
    public static void main(String args[]) {
        int row=5;
        for (int i = 1; i <= row; i++) {
            System.out.print((row-1));
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }               
            // for (int k = i - 1; k >= 1; k--){
            //     System.out.print(k);
            // }    
            System.out.println();
        }
    }
}