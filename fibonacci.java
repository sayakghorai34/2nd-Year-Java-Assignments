public class fibonacci {
    public static void main(String[] args) {
        int range=10,fTerm=0,sTerm=1;
        System.out.println("First "+range+" Numbers in Fibonacci Series are:");
        for(int i = 1;i<=range;++i){
            System.out.print(fTerm+",");
            int nxt = fTerm+sTerm;
            fTerm=sTerm;
            sTerm=nxt;
        }
    }
}
