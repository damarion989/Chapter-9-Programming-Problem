Class Bag extends InventoryComponent {
    private String name;
    private double baseWeight;
    private ArrayList<InventoryComponent> items = new ArrayList<>();

    public Bag(String name, double baseweight) {
        this.name = name;
        this.baseweight = baseWeight;
    }


    public void add(InventoryComponent component) {
        items.remove(component);
}

 public InventoryComponent getChild(int i) {
        return items.get(i);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        double totalWeight = baseWeight;

        for (InventoryComponent component : items) {
            totalWeight += component.getWeight();
        }

        return totalWeight;
    }

    public void displayInfo() {
        System.out.println("Bag: " + name
                + " | Empty weight: " + baseWeight + " lbs");

        for (InventoryComponent component : items) {
            component.displayInfo();
        }

        System.out.println("End of bag: " + name);
    }
}


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
        InventoryComponent backpack = new Bag("Main Backpack", 2.0);
        InventoryComponent bedroll = new Item("Bedroll", 5.0);
        InventoryComponent rope = new Item("Rope", 3.0);

        backpack.add(bedroll);
        backpack.add(rope);

        InventoryComponent potionPouch = new Bag("Potion Pouch", 0.5);
        potionPouch.add(new Item("Health Potion", 1.0));
        potionPouch.add(new Item("Mana Potion", 1.0));

       InventoryComponent holdingBag = new Bag ("Bag of Holding", 1.0);
        holdingBag.add(new Item("Spell Book", 2.0));

       InventoryComponent gemBag = new Bag
        gemBag.add(new Item("Ruby", 0.5));

       holdingBag.add(gemBag);

        backpack.add(potionPouch);
        backpack.add(holdingBag);

        System.out.println("=== FULL INVENTORY ===");
        backpack.displayInfo();
        System.out.println("Total weight: " + backpack.getWeight() + " lbs");

        System.out.println("\n=== POTION POUCH ONLY ===");
        potionPouch.displayInfo();
        System.out.println("Pouch weight: " + potionPouch.getWeight() + " lbs");

        System.out.println("\n=== UNSUPPORTED OPERATION ===");
        InventoryComponent sword = new Item("Sword", 3.0);

        try {
            sword.add(new Item("Gem", 0.5));
        } catch (UnsupportedOperationException e) {
            System.out.println("Warning: An item cannot contain other items.");
        }
    }
}


       
       
    
  
