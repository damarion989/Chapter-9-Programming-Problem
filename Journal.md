## Phase 1
I created InventoryComponent and Item and tested two items. The default exceptions let subclasses override only the operations they support. This provides transparency because clients use the same interface for items and bags, although unsupported operations on items fail at runtime.


## Phase 2
I added Bag with methods to add, remove, and access children. Item returns its own weight, while Bag adds its empty weight to its children's weights. Polymorphism selects the correct method for each child. If a child is another bag, the calls continue recursively without casting or checking its type.
