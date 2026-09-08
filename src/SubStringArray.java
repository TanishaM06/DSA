import java.util.ArrayList;

public class SubStringArray {
    public static void main(String[] args) {
        System.out.println(substringarr("", "abc"));
    }

    static ArrayList<String> substringarr(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = substringarr(p + ch, up.substring(1));
        ArrayList<String> right = substringarr(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}