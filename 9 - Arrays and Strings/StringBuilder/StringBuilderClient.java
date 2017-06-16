public class StringBuilderClient {

   public static void main(String args[]) {
      StringBuilder sb = new StringBuilder();
      
      sb.append("hello");
      sb.append(' ');
      sb.append("world");
      
      sb.append(". ");
      
      sb.append("Force the string builder to grow several times to prove that the grow function works as expected in this implementation of stringbuilder.");
      
      System.out.println(sb.toString());
   }
}