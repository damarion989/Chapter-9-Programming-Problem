## Phase 1
I created InventoryComponent and Item and tested two items. The default exceptions let subclasses override only the operations they support. This provides transparency because clients use the same interface for items and bags, although unsupported operations on items fail at runtime.


## Phase 2
I added Bag with methods to add, remove, and access children. Item returns its own weight, while Bag adds its empty weight to its children's weights. Polymorphism selects the correct method for each child. If a child is another bag, the calls continue recursively without casting or checking its type.

## Phase 3
I built a backpack containing loose items and nested bags. I displayed both the complete inventory and the potion pouch independently using InventoryComponent references. I also caught an unsupported operation on an item. To add a WeightlessBag, I could extend Bag and override getWeight() to return only its empty weight. The existing component, item, and bag classes would remain unchanged; only the setup code would create the new type. This supports the Open/Closed Principle by adding behavior through extension.
