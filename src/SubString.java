public class SubString {
    public static void main (String [] args){
        substring("","abc");
    }

    static void substring (String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        substring( p +ch , up.substring(1));
        substring(p,up.substring(1));
    }
}
