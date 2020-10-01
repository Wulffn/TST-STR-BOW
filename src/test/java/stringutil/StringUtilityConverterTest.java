package stringutil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityConverterTest {

    @Test
    public void testReverseString() {
        String str = "aBc";
        String res = StringUtilityConverter.convert(str, StringMode.REVERSE);
        String exp = "cBa";
        assertEquals(exp, res);
    }

    @Test
    public void testCapitalizeString() {
        String str = "aBc";
        String res = StringUtilityConverter.convert(str, StringMode.CAPITALIZE);
        String exp = "ABC";
        assertEquals(exp, res);
    }

    @Test
    public void testLowercaseString() {
        String str = "aBc";
        String res = StringUtilityConverter.convert(str, StringMode.LOWERCASE);
        String exp = "abc";
        assertEquals(exp, res);
    }

    @Test
    public void testEmptyStringOnMethod() {
        String str = "";
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtilityConverter.convert(str, StringMode.REVERSE);
        });
    }

    @Test
    public void testWhiteSpaceOnMethod() {
        String str = " ";
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtilityConverter.convert(str, StringMode.REVERSE);
        });
    }

    @Test
    public void testWhiteSpaceTrimOnReverseString() {
        String str = "aBc ";
        String res = StringUtilityConverter.convert(str, StringMode.REVERSE);
        String exp = "cBa";
        assertEquals(exp, res);
    }

    @Test
    public void testWhiteSpaceTrimOnUpperCaseString() {
        String str = "aBc ";
        String res = StringUtilityConverter.convert(str, StringMode.CAPITALIZE);
        String exp = "ABC";
        assertEquals(exp, res);
    }

    @Test
    public void testWhiteSpaceTrimOnLowerCaseString() {
        String str = "aBc ";
        String res = StringUtilityConverter.convert(str, StringMode.LOWERCASE);
        String exp = "abc";
        assertEquals(exp, res);
    }

    @Test
    public void testNullOnMethod() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtilityConverter.convert(str, StringMode.REVERSE);
        });
    }

    @Test
    public void testNullOnMode() {
        String str = "aBc";
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtilityConverter.convert(str, null);
        });
    }

    @Test
    public void testNullOnModeAndString() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtilityConverter.convert(str, null);
        });
    }

}
