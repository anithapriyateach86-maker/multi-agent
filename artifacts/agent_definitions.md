# Agent Definitions

| Agent | Responsibility | Dependency |
|---|---|---|
| PlannerAgent | Creates investigation tasks | none |
| OrderAnalysisAgent | Order status/history analysis | Planner |
| InventoryAgent | Allocation/stock analysis | Planner |
| ResponseAgent | Final customer-facing response | BOTH Order Analysis and Inventory |

Order Analysis and Inventory are independent after Planner. Response requires both.
