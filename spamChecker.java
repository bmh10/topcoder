public class SpamChecker {
 
    public String spamCheck(String judgeLog, int good, int bad) {
        int score = 0;
        for (char c : judgeLog.toCharArray()) {
            if (c == 'x') score -= bad;
            else          score += good;
            
            if (score < 0) return "SPAM";
        }
        
        return "NOT SPAM";
    }
}
