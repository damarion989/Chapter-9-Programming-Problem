## Phase 1
I created InventoryComponent and Item and tested two items. The default exceptions let subclasses override only the operations they support. This provides transparency because clients use the same interface for items and bags, although unsupported operations on items fail at runtime.
