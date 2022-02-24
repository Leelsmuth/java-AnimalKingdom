package animal;

public class Fish extends AbstractAnimal {
  public Fish(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "swimming";
  }

  @Override
  public String breathe() {
    return "gills";
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
