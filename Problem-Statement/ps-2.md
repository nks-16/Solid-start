## Problem Statement 2: Library Management System

### Step 1 — Basic Functionality
Implement a system where users can **borrow and return books**.  
- Store book details (`bookId`, `title`, `author`, `isAvailable`).
- Borrowing changes `isAvailable` to `false`, returning sets it back to `true`.

### Step 2 — Adding New Requirements
The library now wants to **add late fees** for overdue books.  
- Late fee is calculated based on the number of days overdue.
- Borrow/return logic must be updated to handle fee calculation.

### Step 3 — Scaling and Modifications
The system must now **support multiple library branches**.  
- Each branch manages its own inventory.
- Late fee policies may differ between branches.

---