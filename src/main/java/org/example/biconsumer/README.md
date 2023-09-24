# Java 8 BiConsumer FI

In Java 8, `BiConsumer` is a functional interface; it takes **two arguments** and **returns nothing**.

```
@FunctionalInterface
public interface BiConsumer<T, U> {
void accept(T t, U u);
}
```
