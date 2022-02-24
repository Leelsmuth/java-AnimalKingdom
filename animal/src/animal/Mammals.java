package animal;

public class Mammals extends AbstractAnimal {
  public Mammals(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "walk";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "live births";
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
