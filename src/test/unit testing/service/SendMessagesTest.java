import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.dto.Emblem;
import com.geektrust.tameofthrones.dto.Kingdom;
import com.geektrust.tameofthrones.service.SendMessages;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.io.ReadFile;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SendMessagesTest {

    @Test
    public void test_SendAllMessagesToKingdoms() {
        
        Southeros southeros = Southeros.getInstance();		//Get the instance of Southeros 
		southeros.ConstructSoutheros();	/*Construct the southeros with the known information about southeros*/
		
        ReadFile readFile = new ReadFile();
        readFile.readInputFile("src/test/resources/input.txt");

        LinkedHashSet <String> allies = new LinkedHashSet<String>(); 
        LinkedHashSet <String> test_allies = new LinkedHashSet<String>(); 
        SendMessages.SendAllMessagesToKingdoms(readFile,southeros,allies);
        test_allies.add("SPACE");
        test_allies.add("LAND");
        test_allies.add("ICE");
        test_allies.add("FIRE");
        assert(allies.equals(test_allies));
    }
}