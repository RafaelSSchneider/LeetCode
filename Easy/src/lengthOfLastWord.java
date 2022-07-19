public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        String[] Splitter = s.split(" ");
        result = Splitter[Splitter.length - 1].length();
        return result;
    }
}
