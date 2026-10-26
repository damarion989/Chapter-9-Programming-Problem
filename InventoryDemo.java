abstract class InventoryComponent {
    pubilc class add(InventoryComponent component)
      throw new UnsupportedOperationExcepion():
  }
  public void remove(InventoryComponent component) {
    throw new UnsupportedOperationExcepion();
  }

  public InventoryComponent getChild(int i) {
    throw new UnsupportedOperationExcepion();
  }

  public String getName() {
    throw new UnsupportedOperationExcepion();
  }

  public void displayInfo() {
    throw new UnsupportedOperationExcepion();
  }
}

class Item extends InventoryComponent {
  private String name;
  private double weight;

  public Item(String name, double wweight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }


  public double getWeight() {
    return weight;
  }

public void displayInfo() {
System.out.println("Item: " + name + " | " + weight + " lbs");
    }
}

public class InventoryDemo {
  public static void main(String[] args) {
    InventoryComponent sword = new Item("Sword", 3.0);
    InventoryComponent potion = new Item("Health Potion", 3.0);

         sword.displayInfo();
        potion.displayInfo();

        System.out.println("Sword weight: " + sword.getWeight());
        System.out.println("Potion weight: " + potion.getWeight());
    }
}
    
  
