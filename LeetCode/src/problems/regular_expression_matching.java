package problems;

public class regular_expression_matching {

	public static void main(String[] args) {

	}

    public static boolean isMatch(String s, String p) {
        for (int i = 0; i < p.length(); i++) {
			
        	if(i > s.length()) {
        		return false;
        				
        	}
        	if(p.charAt(i) == '*') {
				return true;
			}else if(p.charAt(i) == '.') {
				continue;
			}else if(p.charAt(i) == s.charAt(i)) {
				continue;
			}else {
			
				return false;
			}
		}
        return true;
    }
}
