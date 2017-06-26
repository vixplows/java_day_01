import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("Big Red", 11);
    person = new Person();
  }

  @Test
  public void hasName() {
   assertEquals("Big Red", bus.getName());
  }

  @Test
  public void hasNumber() {
    assertEquals(11, bus.getNumber());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

}