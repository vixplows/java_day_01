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

  @Test
  public void canAddPerson() {
    bus.addPerson(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void busIsFull() {
    for(int i =0; i<25; i++){
      bus.addPerson(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void canAddManyPersons() {
    bus.addManyPersons(10);
    assertEquals(10, bus.passengerCount());
  }

}