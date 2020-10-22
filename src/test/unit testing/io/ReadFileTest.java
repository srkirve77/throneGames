import org.junit.jupiter.api.Test;
import java.util.Map;
import com.geektrust.tameofthrones.dto.Southeros;
import com.geektrust.tameofthrones.io.ReadFile;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReadFileTest {

    @Mock
    ReadFile readFile;

    @Test
    public void  test_readInputFile() {
        
        readFile = new ReadFile();
        readFile.readInputFile("src/test/resources/input.txt");
        assertEquals(readFile.getMessages().size(),4);

        /*Following test should return output as 
        "Error : Either Message is not found or Kingdom name is not mentioned in the message!"        
        */
        readFile = new ReadFile();
        readFile.readInputFile("src/test/resources/input1.txt");

        readFile = new ReadFile();
        readFile.readInputFile("src/test/resources/input2.txt");
        assertEquals(readFile.getMessages().size(),0);
    }
}