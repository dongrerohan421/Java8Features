# Java 8 BiFunction FI

In Java 8, `BiFunction` is a functional interface; it takes **two arguments** and **returns an object**.

```
@FunctionalInterface
public interface BiFunction<T, U, R> {
      R apply(T t, U u);
}
```

- T – Type of the first argument to the function.
- U – Type of the second argument to the function.
- R – Type of the result of the function.