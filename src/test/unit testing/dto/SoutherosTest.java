import org.junit.jupiter.api.Test;
import java.util.Map;
import com.geektrust.tameofthrones.dto.Southeros;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/*Southeros class is a singleton class so here we will check whether we can create multiple 
objects or not*/
public class SoutherosTest {
    
    @Mock
    Southeros southeros1;

    @Mock
    Southeros southeros2;

    @Test
    public void getInstance_ShouldNotCreateMoreThanOneObject_returnSameObject() {
        southeros1 = Southeros.getInstance();
        southeros2 = Southeros.getInstance();
        assertTrue(southeros1.equals(southeros2));  /*if the reference is equal then 
        its the same object
        */
    }
}