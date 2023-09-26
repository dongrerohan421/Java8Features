# Java 8 Stream API

### Collections vs Stream API
- **Collections**: If you want to represent group of objects as a single entity then use collections
- **Stream**: If you want to process objects from the collections then use Stream.

A collection is an in-memory data structure to hold values and before we start using collection, 
all the values should have been populated. Whereas a java Stream is a data structure that is computed on-demand. 
Java Stream doesn’t store data, it operates on the source data structure (collection and array) and 
produce pipelined data that we can use and perform specific operations. 
Such as we can create a stream from the list and filter it based on a condition. 
Java Stream operations use functional interfaces, that makes it a very good fit for functional programming using lambda expression. 
As you can see in the above example that using lambda expressions make our code readable and short. 
Java 8 Stream internal iteration principle helps in achieving lazy-seeking in some of the stream operations. 
For example **filtering**, **mapping**, or **duplicate removal** can be implemented lazily, allowing higher performance and scope for optimization. 
Java Streams are consumable, so there is no way to create a reference to stream for future usage. Since the data is on-demand, 
it’s not possible to reuse the same stream multiple times. Java 8 Stream support sequential as well as parallel processing, 
parallel processing can be very helpful in achieving high performance for large collections. 
All the Java Stream API interfaces and classes are in the **java.util.stream** package. Since we can use primitive data types such as int, 
long in the collections using auto-boxing and these operations could take a lot of time, 
there are specific classes for primitive types - **IntStream**, **LongStream** and **DoubleStream**.

