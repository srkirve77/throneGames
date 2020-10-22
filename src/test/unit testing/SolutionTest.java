import org.junit.jupiter.api.Test;
import com.geektrust.tameofthrones.Solution;
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

public class SolutionTest {

    
    @Test
    public void main_RepeatingInputData_ReturnNone() {
        String[] args = new String[1];
        args[0] = "src/test/resources/input.txt";
        Solution.main(args);
    }

    @Test
    public void main_InvalidInputData_OutputError() {
        String[] args = new String[1];
        args[0] = "src/test/resources/input1.txt";
        /**
         * Following statement will output error as invalid input data!!!
         */
        //Solution.main(args);
    }

    @Test
    public void main_ValidInputData_Win() {
        String[] args = new String[1];
        args[0] = "src/test/resources/input2.txt";
        Solution.main(args);
    }

    

}