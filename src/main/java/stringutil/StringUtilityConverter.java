package stringutil;

public class StringUtilityConverter {

    public static String convert(String str, StringMode mode) {
        if(mode == null || str == null|| str.replaceAll(" ", "").equals("")) throw new IllegalArgumentException();
        switch (mode) {
            case REVERSE:
                return new StringBuilder(str).reverse().toString().trim();
            case CAPITALIZE:
                return str.toUpperCase().trim();
            case LOWERCASE:
                return str.toLowerCase().trim();
        }
        return str;
    }
}
