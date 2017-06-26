public class Bus {

  private String name;
  private int number;
  private Person[] passengers;

  public Bus(String name, int number) {
    this.name = name;
    this.number = number;
    this.passengers = new Person[25];
  }

  public String getName() {
    return this.name;
  }

  public int getNumber() {
    return this.number;
  }

  public int passengerCount() {
    int count = 0;
    for(Person person : passengers) {
      if(person != null) {
        count++;
      }
    }
    return count;
  }

  public void addPerson(Person person) {
    if(isBusFull()) return;
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }

  public boolean isBusFull() {
    return passengerCount() >= passengers.length;
  }

}
