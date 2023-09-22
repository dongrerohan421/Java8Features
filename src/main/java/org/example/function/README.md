# Java 8 Function FI

n Java 8, Function is a functional interface; it takes an argument (object of type T) and returns an object (object of type R). 
The argument and output can be a different type.

```
@FunctionalInterface
public interface Function<T, R> {
      R apply(T t);
}
```
- T – Type of the input to the function.
- R – Type of the result of the function.