        System.out.println("\n=== EMPTY BAG TEST ===");
        InventoryComponent emptyBag = new Bag("Empty Bag", 0.75);
        emptyBag.displayInfo();

        System.out.println("Expected: 0.75 lbs");
        System.out.println("Actual: " + emptyBag.getWeight() + " lbs");

        System.out.println("\n=== NESTED WEIGHT TEST ===");
        System.out.println("Expected: 16.25 lbs");
        System.out.println("Actual: " + backpack.getWeight() + " lbs");

        System.out.println("\n=== REMOVE ITEM TEST ===");
        double before = backpack.getWeight();
        backpack.remove(rope);
        double after = backpack.getWeight();

        System.out.println("Before removal: " + before + " lbs");
        System.out.println("After removal: " + after + " lbs");
        System.out.println("Expected after removal: 13.25 lbs");
        System.out.println("Weight removed: " + (before - after) + " lbs");

        backpack.displayInfo();
