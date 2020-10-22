import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.dto.Emblem;
import com.geektrust.tameofthrones.dto.Kingdom;
import java.util.Map;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KingdomTest {

    @Mock
    private Kingdom kingdom1;

    @Mock
    private Kingdom kingdom2;

    @Mock
    private Kingdom kingdom3;

    
    
    @BeforeEach
    public void init() {
        
        this.kingdom1 = new Kingdom("SPACE",new Emblem("GORILLA"));
        this.kingdom2 = new Kingdom("LAND",new Emblem("PANDA"));
        this.kingdom3 = new Kingdom("ABC",new Emblem(""));
    }

    @Test
    void  test_hash_animalName(){

        Map<Character,Integer> animalName_hashed = new HashMap<Character,Integer>();
        Map<Character,Integer> test_hashed = new HashMap<Character,Integer>();
        test_hashed.put('P',1);
        test_hashed.put('A',2);
        test_hashed.put('N',1);
        test_hashed.put('D',1);
        kingdom2.hash_animalName(animalName_hashed);
        assertTrue(animalName_hashed.equals(test_hashed));

        animalName_hashed.clear();
        test_hashed.clear();
        kingdom3.hash_animalName(animalName_hashed);
        assertTrue(animalName_hashed.equals(test_hashed));
    }

    @Test
    void test_ReceiveMessage() {
        assertTrue(kingdom2.ReceiveMessage("FAIJWJSOOFAMAU"));
        assertFalse(kingdom2.ReceiveMessage("PANDA"));
        assertFalse(kingdom2.ReceiveMessage(""));
    }

}