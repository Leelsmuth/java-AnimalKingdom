package animal;

public class Birds extends AbstractAnimal {
  public Birds(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "flying";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }

  @Override
  public String toString() {
    return "Animals{" +
        "id=" + id + ", " +
        "name=" + name +
        ", yearNamed='" + yearNamed + '\'' +
        '}';
  }
}
