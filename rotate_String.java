public class rotate_String {
    public boolean rotateString(String s, String goal) {
       return (s.length()==goal.length() && (s+s).contains(goal));
    }
}