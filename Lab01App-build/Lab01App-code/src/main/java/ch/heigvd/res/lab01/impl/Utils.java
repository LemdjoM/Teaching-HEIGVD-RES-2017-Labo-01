package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
      // throw new UnsupportedOperationException("The student has not implemented this method yet.");
         /*line's separators*/
         /* The \r\n most be the first one*/
         String[] delimiters = {"\r\n", "\r", "\n"}; 
         /*Result extended*/
         String[] tokens = new String[2];
         /*There is at least one separator*/
         for (String delim : delimiters) {
            int index = lines.indexOf(delim);
            if (index != -1){
               tokens[0] = lines.substring(0, index + delim.length());
               tokens[1] = lines.substring(index + delim.length());
               return tokens;
            }
         }
         /*There in no separator*/
         tokens[0] = "";
         tokens[1] = lines;
         return tokens;
  }

}
