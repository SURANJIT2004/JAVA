package recursive;
public class Stringmatching 
{

	    public static int bruteForceSearch(String text, String pattern) {
	        int count = 0;
	        for (int i = 0; i <= text.length() - pattern.length(); i++) {
	            boolean match = true;
	            for (int j = 0; j < pattern.length(); j++) {
	                if (text.charAt(i + j) != pattern.charAt(j)) {
	                    match = false;
	                    break;
	                }
	            }
	            if (match) {
	                // Pattern found at index i
	                System.out.println("Pattern found at index: " + i);
	                count++;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String inputText = "abccddaefg";
	        String inputPattern = "abc";
	        int occurrences = bruteForceSearch(inputText, inputPattern);
	        System.out.println("Number of occurrences: " + occurrences);
	    }
	}

