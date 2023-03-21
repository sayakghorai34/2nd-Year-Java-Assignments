public class classpractice {
    public static void main(String[] args) {
        int n=1,range=10,j;
        j=Sum(n,range);
        System.out.println(j);
    }
    static int Sum(int n,int range){
        int res=0;
        if(range>0){
            res=n+Sum(n+1,range-1);      
        }
        return res;
    }
}
