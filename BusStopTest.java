import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  BusStop busStop;
  Person person;

  @Before
  public void before() {
    busStop = new BusStop("Easter Road");
    person = new Person();
  }

  @Test
  public void hasName() {
    assertEquals("Easter Road", busStop.getName());
  }

  @Test
  public void busStopStartsEmpty() {
    assertEquals(0, busStop.queueCount());
  }

  @Test
  public void canSetQueueLength() {
    busStop.setQueueLength(6);
    assertEquals(6, busStop.queueCount());
  }

  @Test
  public void canRemovePersonFromQueue() {
    busStop.setQueueLength(6);
    busStop.removePerson();
    assertEquals(5, busStop.queueCount());
  }
}