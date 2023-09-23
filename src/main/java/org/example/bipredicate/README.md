# Java 8 BiPredicate

In Java 8, `BiPredicate` is a functional interface, which **accepts two arguments** and **returns a boolean**, basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.

```
@FunctionalInterface
public interface BiPredicate<T, U> {
boolean test(T t, U u);
}
```
