import org.junit.jupiter.api.Test;
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
        
        this.kingdom1 = new Kingdom("SPACE","GORILLA");
        this.kingdom2 = new Kingdom("LAND","PANDA");
    }
}