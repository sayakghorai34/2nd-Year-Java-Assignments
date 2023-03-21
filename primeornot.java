public class primeornot {
    public static void main(String[] args) {
        int num = 13;
        char flag='t';
        for(int i=2;i<num;i++){
            if(num%i==0){
                    flag='f';
                }
            }
            System.out.print("Status: "+flag);
        System.out.print("  =>>Where 't' represents Prime and 'f' represents Non-Prime <<== ");
    }
    
}
