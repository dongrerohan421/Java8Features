# Java 8 Supplier FI
In Java 8, `Supplier` is a functional interface; it takes **no arguments** and **returns a result**.
```
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```
