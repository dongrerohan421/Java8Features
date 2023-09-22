# Java 8 Consumer FI

In Java 8, `Consumer` is a functional interface; it takes an argument and returns nothing.

```
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```

### Java Consumer Interface Methods
| Method                                                | Description                                                                                                                                                                                                                                                                                                        |
|-------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void accept(T t)                                      | It performs this operation on the given argument.                                                                                                                                                                                                                                                                  |
| default Consumer<T>andThen(Consumer<? super T> after) | It returns a composed Consumer that performs, in sequence, this operation followed by the after operation. If performing either operation throws an exception, it is relayed to the caller of the composed operation. If performing this operation throws an exception, the after operation will not be performed. |
