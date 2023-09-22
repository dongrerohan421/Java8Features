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

### Java Function Interface Methods

| Method                                                                    | 	Description                                                                                                                                                                                                                                  |
|---------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| default <V> Function<T,V> andThen(Function<? super R,? extends V> after)  | 	It returns a composed function that first applies this function to its input, and then applies the after function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function. |
| static <T> Function<T,T> identity()                                       | 	It returns a function that always returns its input argument.                                                                                                                                                                                |
| R apply(T t)                                                              | It applies this function to the given argument.                                                                                                                                                                                               |
| default <V> Function<V,R> compose(Function<? super V,? extends T> before) | It Returns a composed function that first applies the before function to its input, and then applies this function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the composed function. |
