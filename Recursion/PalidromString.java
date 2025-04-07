public class PalidromString {
    public static boolean isPalidrom(String str,int i,int j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        if(i>=j){
            return true;
        }


        return isPalidrom(str, i+1, j-1);


    }
    public static void main(String[] args) {
        boolean ans=isPalidrom("madam", 0, 4);
        System.out.println(ans);
        
    }
}
