package animal;

abstract class AbstractAnimal {
  private static int maxId = 0;
  protected int id;
  protected String name;
  protected int yearNamed;

  public AbstractAnimal(String name, int yearNamed) {
    maxId++;
    id = maxId;

    this.name = name;
    this.yearNamed = yearNamed;
  }

  public String eat() {
    return "crunch";
  }

  abstract String move();

  abstract String breathe();

  abstract String reproduce();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return yearNamed;
  }

  public void setYear(int year) {
    this.yearNamed = year;
  }

  public int getId() {
    return id;
  }
}
