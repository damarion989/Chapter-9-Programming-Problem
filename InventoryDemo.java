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
        InventoryComponent pouch = new Bag("Belt Pouch", 0.5);

        pouch.add(new Item("Health Potion", 1.0));
        pouch.add(new Item("Mana Potion", 1.0));

        pouch.displayInfo();
        System.out.println("Total weight: " + pouch.getWeight() + " lbs");
        System.out.println("First item: " + pouch.getChild(0).getName());
    }
}
    
  
