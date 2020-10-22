import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.service.ReceiveMessageImpl;
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

public class ReceiveMessageImplTest {

    @Mock
    ReceiveMessageImpl receiveMessageImpl = new ReceiveMessageImpl();  

    @Test
    public void decipherMessage_EmptyStrings_False() {
        assertFalse(receiveMessageImpl.decipherMessage(new GetMessage("","")));
    }

    @Test
    public void decipherMessage_EmptyMessage_False() {
        assertFalse(receiveMessageImpl.decipherMessage(new GetMessage("ICE","")));
    }

    @Test
    public void decipherMessage_EqualStrings_False() {
        assertFalse(receiveMessageImpl.decipherMessage(new GetMessage("ICE","ICE")));
    }
 
}