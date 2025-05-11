/**
 * The Morse class converts a given string into Morse code.
 */
class Morse {
    private String original; // The original string to be converted
    private String mcode;// The Morse code representation of the original string
    private char[] regular;
    private char[][] morse;

    /**
     * Constructs a Morse object with the given input string.
     *
     * @param input The input string to be converted to Morse code.
     */
    public Morse(String input) {
        original = input;
    }

    /**
     * Converts a single character into its Morse code representation.
     *
     * @param ch The character to be converted.
     * @return The Morse code representation of the input character.
     */
    public String toMorse(char ch) {
        switch(ch) {
            // Morse code mappings for specific characters
            case ' ': return " ";
            case ',': return "--..--";
            case '.': return ".-.-.-";
            case '?': return "..--..";
            case '0': return "-----";
            case '1': return ".----";
            case '2': return "..---";
            case '3': return "...--";
            case '4': return "....-";
            case '5': return ".....";
            case '6': return "-....";
            case '7': return "--...";
            case '8': return "---..";
            case '9': return "----.";
            case 'A': return ".-";
            case 'B': return "-...";
            case 'C': return "-.-.";
            case 'D': return "-..";
            case 'E': return ".";
            case 'F': return "..-.";
            case 'G': return "--.";
            case 'H': return "....";
            case 'I': return "..";
            case 'J': return ".---";
            case 'K': return "-.-";
            case 'L': return ".-..";
            case 'M': return "--";
            case 'N': return "-.";
            case 'O': return "---";
            case 'P': return ".--.";
            case 'Q': return "--.-";
            case 'R': return ".-.";
            case 'S': return "...";
            case 'T': return "-";
            case 'U': return "..-";
            case 'V': return "...-";
            case 'W': return ".--";
            case 'X': return "-..-";
            case 'Y': return "-.--";
            case 'Z': return "--..";
        }
        return ""; // Return empty string for characters not in Morse code mapping
    }

    /**
     * Converts the entire original string into its Morse code representation.
     *
     * @return The Morse code representation of the original string.
     */
    public String getMorseCode() {
        mcode = "";
        // Iterate through each character in the original string and convert it to Morse code
        for(int i = 0; i < original.length(); i++)
            mcode += toMorse(original.charAt(i)) + " "; // Add space between Morse code characters
        return mcode;
    }

    /**
     * Returns the original input string.
     *
     * @return The original input string.
     */
    public String getOriginal() {
        return original;
    }
}
