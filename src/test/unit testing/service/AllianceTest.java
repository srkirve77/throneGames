import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.service.Alliance;
import com.geektrust.tameofthrones.exchanges.GetMessage;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;

import jdk.internal.jline.internal.TestAccessible;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AllianceTest {

    
    @Test
    public void updateAlliance_EmptyGetMessage_False() {
        Kingdom ruler = new Kingdom("SPACE","GORILLA");
        Alliance.updateAlliance(ruler,new GetMessage("",""));
        assertEquals(ruler.getAllies().size(),0);
    }

    @Test
    public void updateAlliance_InvalidGetMessage_False() {
        Kingdom ruler = new Kingdom("SPACE","GORILLA");
        Alliance.updateAlliance(ruler,new GetMessage("CE","THE"));
        assertEquals(ruler.getAllies().size(),0);
    }

}