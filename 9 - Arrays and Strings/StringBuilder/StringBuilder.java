public class StringBuilder {
   private static final int MAX = 2;
   private char[] buffer;
   private int count;
   
   public StringBuilder() {
      buffer = new char[MAX];
      count = 0;
   }
   
   public void append(char c) {
      if (count == buffer.length) {
         grow();
      }
      buffer[count] = c;
      count++;
   }
   
   public void append(String s) {
      if (s != null && s.length() > 0) {
         for (int i = 0; i < s.length(); i++) {
            append(s.charAt(i));
         }
      }
   }
   
   private void grow() {
      char[] result = new char[2 * buffer.length];
      for (int i = 0; i < buffer.length; i++) {
         result[i] = buffer[i];
      }
      buffer = result;
   }
   
   public String toString() {
      return new String(buffer, 0, count);
   }
}