public class ReverseString {
    public void  reverseString(String str){
        if(str.length()==0){
            return ;
        }
       System.out.print(str.charAt(str.length()-1));
       reverseString(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        ReverseString r1=new ReverseString();
        String str="hello world";
        r1.reverseString(str.trim());
        
    }
}
