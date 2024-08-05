# Observer pattern

The observer pattern defines a one-to-many relationship, when one object changes state, all its dependents are notified and updated automatically.

The subject and the observers define the one-to-many relationship.

One-subject notifies many observers.

| Item                   | Desc                                                                  |
| :--------------------: |:---------------------------------------------------------------------:|
| Subject Interface      | Defines methods to register, remove, & notify observers               |
| Concrete Subject       | Implements the Subject interface                                      |
| Observer Interface     | Defines the update method that concrete observers must implement      |
| Concrete Observer      | Implements the Observer interface                                     |