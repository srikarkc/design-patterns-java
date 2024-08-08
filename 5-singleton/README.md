# Singleton Pattern

Singleton patterns ensures that a class has only 1 instance and provides a global point of access to it.

The main challenges faced by the Singleton implementations are:

1. Eager loading
2. Overhead due to synchronization

Bill Pugh Singleton pattern addresses both of them with the help of a private static inner class.

```java
public class BillPughSingleton {
    private BillPughSingleton() {

    }

    private static class SingletonHelper {
        private static final BillPughSingleton BILL_PUGH_SINGLETON_INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.BILL_PUGH_SINGLETON_INSTANCE;
    }
}
```
