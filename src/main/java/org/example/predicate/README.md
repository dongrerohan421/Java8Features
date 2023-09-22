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
### Java Predicate Interface Methods

| Methods                                              | 	Description                                                                                                                                                                                                                 |
|------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| boolean test(T t)                                    | It evaluates this predicate on the given argument.                                                                                                                                                                           |
| default Predicate<T> and(Predicate<? super T> other) | It returns a composed predicate that represents a short-circuiting logical AND of this predicate and another. When evaluating the composed predicate, if this predicate is false, then the other predicate is not evaluated. |
| default Predicate<T> negate()	                       | It returns a predicate that represents the logical negation of this predicate.                                                                                                                                               |                                                                                                                                                                 
| default Predicate<T> or(Predicate<? super T> other)  | It returns a composed predicate that represents a short-circuiting logical OR of this predicate and another. When evaluating the composed predicate, if this predicate is true, then the other predicate is not evaluated.   | 
| static <T> Predicate<T> isEqual(Object targetRef)    | It returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).                                                                                                                    | 
