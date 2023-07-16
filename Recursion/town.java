public class TownFinder {
    public static void main(String[] args) {
        String[] citizens = { "rostom", "rosjerry", "roslice" };
        
        String town = findCommonSubstring(citizens);

        System.out.println("Town of all citizens: " + town);
    }

    public static String findCommonSubstring(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        String firstString = strings[0];
        int n = firstString.length();

        for (int i = 0; i < n; i++) {
            char c = firstString.charAt(i);

            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != c) {
                    return firstString.substring(0, i);
                }
            }
        }

        return firstString;
    }
}

