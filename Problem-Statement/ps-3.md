## Problem Statement 3: Ride-Hailing Application

### Step 1 — Basic Functionality
Create a module that **matches riders with drivers**.  
- Store basic details (`rideId`, `riderName`, `driverName`, `pickupLocation`, `dropLocation`).
- A ride is confirmed when a driver accepts.

### Step 2 — Adding New Requirements
Add a **ride cancellation feature**.  
- If a driver cancels, a new driver must be assigned.
- If a rider cancels, the ride is removed from the system.

### Step 3 — Scaling and Modifications
Introduce **dynamic pricing and driver ratings**.  
- Pricing changes based on demand and distance.
- Drivers must have ratings, and riders can filter by minimum rating.
