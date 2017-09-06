public class Genetics {
    
    public String getOffspring(String g1, String g2, String dom) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < g1.length(); i++) {
            char c1 = g1.charAt(i);
            char c2 = g2.charAt(i);
            if (c1 == c2) {
                sb.append(c1);
            }
            else if (dom.charAt(i) == 'D') {
                sb.append(Character.toUpperCase(c1));
            }
            else {
                sb.append(Character.toLowerCase(c1));
            }
        }
        
        return sb.toString();
    }
}
