#### `Callable` 接口详解

一般继承 `Thread` 的类，含有 `.start()` 函数，所以直接可以使用 `.start()` 函数进行启动。

实现 `Runnable` 的类，需要通过 `new Thread(myRunnable).start();` 的方式进行启动，即实现 `Runnable` 的类只是做好了一段多线程所需执行的内容，自身并没有执行的能力，需要通过 `Thread` 类的 `.start()` 函数进行启动。

实现 `Callable` 的接口，含有 `.call()` 函数，所以可以直接使用 `.call()` 函数进行启动，另外值得说明的是，`Callable` 函数具有返回值，返回值为定义类时使用的 `` 类型，其定义是其返回。`Callable` 接口定义如下所示：

```java
@FunctionalInterface
public interface Callable<V> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    V call() throws Exception;
}
```

`Callable` 用于指示接口类型声明是由 Java 语言规范定义的功能接口。从概念上讲，函数接口只有一个抽象方法。因为 `java.lang.reflect.Method#isDefault()default methods` 有一个实现，所以它们不是抽象的。如果接口声明一个抽象方法重写 `java.lang.Object` 的一个公共方法，则该方法也不计入接口的抽象方法计数，因为接口的任何实现都将具有来自 `java.lang.Object` 或其他位置的实现。

另外注意，函数接口的实例可以使用 lambda 表达式、方法引用或构造函数引用创建。

> **`Callable` 在需要使用返回值的情况下，程序是同步运行的**
>
> **`Callable` 其它情况下，程序是异步运行的**

在阅读 `Callable` 接口的过程中，建议读者多做几个测试，查看相应返回、程序执行时间，看出异步与同步的区别，由于代码过于简单，只需要增加几个 `sleep()` 函数，在 `study2.java` 类中更改一下即可，所以这里略过不提。