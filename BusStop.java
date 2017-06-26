public class BusStop {

  private String name;
  private Person[] queue;

  public BusStop(String name) {
    this.name = name;
    this.queue = new Person[10];
  }

  public String getName() {
    return this.name;
  }

  public int queueCount() {
    int count = 0;
    for(Person person : queue) {
      if(person != null) {
        count++;
      }
    }
    return count;
  }

}