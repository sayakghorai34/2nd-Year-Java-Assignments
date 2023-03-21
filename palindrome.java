public class palindrome {
    public static void main(String[] args) {
        int num=10;
        String str=Integer.toString(num),rev="";
        int len= str.length();
        for(int i=(len-1);i>=0;--i){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is a Palindrome Number");
        }
        else{
            System.out.println(str+" is not a Palindrome Number");
        }

    }
    
}
