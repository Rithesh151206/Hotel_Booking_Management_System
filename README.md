Use Case 3 – Centralized Room Inventory Management
Description

This use case introduces a centralized inventory management mechanism for hotel rooms.

A dedicated class RoomInventory is used to maintain the availability of different room types in a single location. This class acts as the single source of truth for room availability in the hotel system.

Room pricing and characteristics are still obtained from the room classes (SingleRoom, DoubleRoom, and SuiteRoom). This ensures that room information and inventory management remain separate responsibilities, improving maintainability and reducing duplication.

At this stage, the system only demonstrates how room availability is stored and retrieved using a centralized structure. No booking, reservation, or search functionality is implemented yet.