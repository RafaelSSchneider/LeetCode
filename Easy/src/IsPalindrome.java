public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int x) {
    boolean check = false;
    StringBuilder normal = new StringBuilder(Integer.toString(x));
    StringBuilder reversed = new StringBuilder(Integer.toString(x));
    reversed.reverse();
       if(normal.toString().equals(reversed.toString())){
            check = true;
        }
        return check;
    }
}
