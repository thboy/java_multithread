#### . 初步认识 `synchronized` 关键字

在 test8 的测试之中，通过在 run 方法前加入 `synchronized` 关键字，使多个线程在执行 run 方法时，以排队的方式进行处理。

当一个线程想要执行同步方法里面的代码之前，会先判断 `run` 方法有没有被上锁，如果被上锁，说明有其他线程正在调用 `run` 方法，必须等其它线程对 `run` 方法调用结束后才可以执行 `run` 方法。这样也就实现了排队调用 `run` 方法的目的，也就达到了解决实例变量共享的安全问题的目的。

`synchronized` 可以在任意对象及方法上加锁，而加锁的这段代码被称之为“互斥区”或“临界区”。