package animal;

/**
 * Interface for a lambda expression to filter a list of AbstractVehicles.
 * Normally Javadocs are put on the interface and not its implementation.
 * The implementation just contains Javadocs for anything new.
 */
public interface CheckAnimal {
  /**
   * This is the method the lambda expression will implement
   *
   * @param a the object (AbstractAnimal) to check
   *
   * @return (boolean) true if a filtered item, otherwise false
   */
  boolean test(AbstractAnimal a);
}
