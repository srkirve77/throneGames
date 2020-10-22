import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.service.StringOperationsImpl;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.io.ReadFile;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;

import jdk.internal.jline.internal.TestAccessible;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StringOperationsImplTest {

    @Mock
    StringOperationsImpl stringOperationsImpl = new StringOperationsImpl();

    @Test
    public void sortString_SortValidString_ReturnSortedString() {
        assertEquals(stringOperationsImpl.sortString("edcba"),"abcde");
    }

    @Test
    public void sortString_SortEmptyString_ReturnEmptyString() {
        assertEquals(stringOperationsImpl.sortString(""),"");
    }

    @Test
    public void sortString_SortOneCharString_ReturnOneChar() {
        assertEquals(stringOperationsImpl.sortString("a"),"a");
    }

    @Test
    public void rotateString_RotateValidString__ReturnRotatedString() {
        //System.out.println(stringOperationsImpl.rotateString("ABCDE", 3));
        assertEquals(stringOperationsImpl.rotateString("ABCDE", 3),"XYZAB");
    }

    @Test
    public void rotateString_RotateEmptyString_ReturnEmptyString() {
        assertEquals(stringOperationsImpl.rotateString("", 5),"");
    }

    @Test
    public void rotateString_RotateA26times_ReturnAItself() {
        assertEquals(stringOperationsImpl.rotateString("A", 26),"A");
    }

    @Test
    public void rotateString_RotateMoreThan26times() {
        assertEquals(stringOperationsImpl.rotateString("ABC", 50),"CDE");
    }

    @Test
    public void verifyStringPresence_InputEmptyString_ReturnFalse() {
        assertFalse(stringOperationsImpl.verifyStringPresence("ABCDE",""));
    }

    @Test
    public void verifyStringPresence_EqualStrings_ReturnTrue() {
        assertTrue(stringOperationsImpl.verifyStringPresence("ABCDE","ABCDE"));
    }

    @Test
    public void verifyStringPresence_EdgeCase_ReturnTrue() {
        assertTrue(stringOperationsImpl.verifyStringPresence("ABBBCDE","BBCDE"));
    }

}