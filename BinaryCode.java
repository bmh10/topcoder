public class BinaryCode {

  public String[] decode(String message) {
    int[] Q = new int[message.length()];
    char[] msg = message.toCharArray();
    
    for (int i = 0; i < message.length(); i++) {
      Q[i] = Character.getNumericValue(msg[i]);
    }
    
    String[] ret = {decode(Q, 0), decode(Q, 1)};
    return ret;
  }
  
  public String decode(int[] Q, int p0) {
    int[] P = new int[Q.length];
    P[0] = p0;
    StringBuilder sb = new StringBuilder();
    sb.append(p0);
    
    for (int i = 1; i < P.length; i++) {
      int a = i-2 < 0 ? 0 : P[i-2];
      P[i] = Q[i-1] - (P[i-1] + a);
      if (P[i] != 0 && P[i] != 1) {
        return "NONE";
      }
      sb.append(P[i]);
    }
    
    return sb.toString();
  }
}
