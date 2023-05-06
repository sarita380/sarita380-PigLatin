
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        
        if (in==null || in.isEmpty()){
            return in;
        }
        String lowCase = in.toLowerCase();
        char firstCharacters = lowCase.charAt(0);

        if(!Character.isAlphabetic(firstCharacters)){
            return in;
        }
        String end = "ay";
        int leng = lowCase.length();
        String word = lowCase.substring(1, leng);
        return word + firstCharacters + end; 
        
    }
}
