public class NewPalidromString {
    public static boolean isPalidrom(String str){
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp=temp+str.charAt(i);

        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=temp.charAt(i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        boolean ans=isPalidrom("abba");
        System.out.println(ans);
        
    }
}
