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
    public void  test_for_valid_input() {
        
        readFile = new ReadFile();
        readFile.readInputFile("src/test/resources/input.txt");
        assertEquals(readFile.getMessages().size(),4);
    }
    
    @Test
    public void ReadInputFile_TestForInvalidInput_GiveError() {
        
        /*Following test should return output as 
            "Invalid Input Data!!!"        
        */
        readFile = new ReadFile();
        //readFile.readInputFile("src/test/resources/input1.txt");
        //readFile.getMessages().size();
    }
}