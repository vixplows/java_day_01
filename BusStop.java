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

  public void setQueueLength(int queueLength) {
    for(int i = 0; i < queueLength; i++) {
      this.queue[i] = new Person();
    }
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

  public void removePerson() {
    int queueCount = queueCount();
    Person person = queue[queueCount - 1];
    queue[queueCount - 1] = null;
  }

  public void emptyQueue() {
    for(int i = 0; i < queue.length; i++) {
      queue[i] = null;
    }
  }

  public void fillBusEmptyBusStop(Bus bus) {
    int queueCount = queueCount();
    bus.addManyPersons(queueCount);
    emptyQueue();
    }
    // need to be able to add multiple person to bus
    // need to be able to empty the busStop
}