package animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static List<AbstractAnimal> filteredList = new ArrayList<>();

  public static void filterAnimals(List<AbstractAnimal> animals, CheckAnimal tester, boolean printit) {
    // start with a fresh filteredList
    filteredList.clear();

    for (AbstractAnimal a : animals) {
      if (tester.test(a)) {
        if (printit) {
          System.out
              .println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe() + " " + a.getYear());
        }
        filteredList.add(a);
      }
    }
  }

  public static void main(String[] args) {

    Mammals panda = new Mammals("Panda", 1869);
    Mammals zebra = new Mammals("Zebra", 1778);
    Mammals koala = new Mammals("Koala", 1816);
    Mammals sloth = new Mammals("Sloth", 1804);
    Mammals armadillo = new Mammals("Armadillo", 1758);
    Mammals raccoon = new Mammals("Raccoon", 1758);
    Mammals bigFoot = new Mammals("BigFoot", 2021);

    Birds pigeon = new Birds("Pigeon", 1837);
    Birds peacock = new Birds("Peacock", 1821);
    Birds toucan = new Birds("Toucan", 1758);
    Birds parrot = new Birds("Parrot", 1824);
    Birds swan = new Birds("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("CatFish", 1817);
    Fish perch = new Fish("Perch", 1758);

    List<AbstractAnimal> animalList = new ArrayList<>();
    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigFoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    // 1. List all animals in descending order by year named:
    System.out.println("Animals in descending order by year");
    animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
    System.out.println(animalList.toString());

    // 2. List all the animals alphabetically
    System.out.println();
    System.out.println("Listing all animal alphabetically");
    animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    System.out.println(animalList.toString());

    // 3. List all the animals order by how they move
    System.out.println();
    System.out.println("Listing all animals order by how they move");
    animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    System.out.println(animalList.toString());

    // 4. List only those animals that breath with lungs
    System.out.println();
    System.out.println("Listing all animals that breath with lungs");
    filterAnimals(animalList, a -> a.breathe().equals("lungs"), true);

    // 5. List only those animals that breath with lungs and were named in 1758
    System.out.println();
    System.out.println("Listing all animals that breath with lungs and were named in 1758");
    filterAnimals(animalList, a -> a.breathe().equals("lungs") && a.getYear() == (1758), true);

    // 6. List only those animals that lay eggs and breath with lungs
    System.out.println();
    System.out.println("Listing all animals that that lay eggs and breath with lungs");
    filterAnimals(animalList, a -> a.reproduce().equals("eggs") && a.breathe().equals("lungs"), true);

    // 7. List alphabetically only those animals that were named in 1758
    System.out.println();
    System.out.println("Listing all animals alphabetically that were named in 1758");
    animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    filterAnimals(animalList, a -> a.getYear() == (1758), true);

    // 7. For the list of animals, list alphabetically those animals that are
    // mammals
    System.out.println();
    System.out.println("Listing all animals alphabetically that are mammals");
    animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    filterAnimals(animalList, a -> a instanceof Mammals, true);
  }
}