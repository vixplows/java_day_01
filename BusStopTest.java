import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  BusStop busStop;

  @Before
  public void before() {
    busStop = new BusStop("Easter Road");
  }

  @Test
  public void hasName() {
    assertEquals("Easter Road", busStop.getName());
  }
}