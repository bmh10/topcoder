import java.util.*;

public class Hawaiian {
    
    public String[] getWords(String sentence) {
        
        List<String> ws = new ArrayList<String>();
        for (String s : sentence.split(" ")) {
            if (s.matches("(?i)[aeiouhklmnpw]+")) {
                ws.add(s);
            }
        }
                
        return ws.toArray(new String[ws.size()]);
    }
}
