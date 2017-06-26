import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  BusStop busStop;
  Person person;
  Bus bus;

  @Before
  public void before() {
    busStop = new BusStop("Easter Road");
    person = new Person();
    bus = new Bus("Little Green", 8);
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


  @Test
  public void canEmptyQueue() {
    busStop.setQueueLength(6);
    busStop.emptyQueue();
    assertEquals(0, busStop.queueCount());
  }

  @Test
  public void canFillBusWithPersonsFromBusStopQueue() {
    busStop.setQueueLength(6);
    busStop.fillBusEmptyBusStop(bus);
    assertEquals(0, busStop.queueCount());
    assertEquals(6, bus.passengerCount());
  }
}
  

