# Java 8 Predicate FI
In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean. 
Usually, it used to apply in a filter for a collection of objects.
- Wherever some conditional checks are required to implement then we should use Predicate FI
- Predicate FI returns Boolean value
- Predicate FI has test() abstract method.

```
@FunctionalInterface
public interface Predicate<T> {
boolean test(T t);
}
```
