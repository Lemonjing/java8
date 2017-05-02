# java8
 Lambda、Functional Interface、Stream and Date/Time API 
 
Method Reference 方法引用
------------------------

有时候Lambda表达式的代码就只是一个简单的方法调用而已，遇到这种情况，Lambda表达式还可以进一步简化为 方法引用（Method References）。

一共有四种形式的方法引用

第一种引用 静态方法 ，例如：

```
List<Integer> ints = Arrays.asList(1, 2, 3);
ints.sort(Integer::compare);
```

第二种引用 某个特定对象的实例方法

例如前面那个遍历并打印每一个word的例子可以写成这样：

```words.forEach(System.out::println);```

第三种引用 某个类的实例方法

```
words.stream().map(word -> word.length()); // lambda
words.stream().map(String::length); // method reference
```

第四种引用类的构造函数 ，例如：

```
// lambda
words.stream().map(word -> {
    return new StringBuilder(word);
});
// constructor reference
words.stream().map(StringBuilder::new);
```