import HandheldWaxPC.Handheld;
import HandheldWaxPC.Wax;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHandheld {
    @Test
    public void handheldSpec(){
        //Testing suggestWax();
        Wax testWax = HandheldWaxPC.Handheld.suggestWax(24,"powder");
        assertEquals("Test failed.  Suggested wax color incorrect :","Blue",testWax.getColor());
        assertEquals("Test failed.  Suggested wax variety incorrect :","Special",testWax.getVariety());
        System.out.println("Test passed (expected Blue - Special) : ");
        Handheld.printWax(testWax);
    }
}
