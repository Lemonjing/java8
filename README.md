# java8

```
Lambda Expression、Method Reference

Functional Interface、Default & Static Method、Optional Class

Stream 

Date/Time API

Base64

```

Lambda Expression
-----------------

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

Functional Interface
--------------------

```
    接口	                            描述
BitConsumer	          该接口代表了接收两个输入参数T、U，并且没有返回的操作
BiFunction	          该接口代表提供接收两个参数T、U，并且产生一个结果R的方法
BinaryOperator	      代表了基于两个相同类型的操作数，产生仍然是相同类型结果的操作
BiPredicate	          代表了对两个参数的断言操作（基于Boolean值的方法）
BooleanSupplier	      代表了一个给出Boolean值结果的方法
Consumer	          代表了接受单一输入参数并且没有返回值的操作
DoubleBinaryOperator  代表了基于两个Double类型操作数的操作，并且返回一个Double类型的返回值
DoubleConsumer	      代表了一个接受单个Double类型的参数并且没有返回的操作
DoubleFunction	      代表了一个接受Double类型参数并且返回结果的方法
DoublePredicate	      代表了对一个Double类型的参数的断言操作
DoubleSupplier	      代表了一个给出Double类型值的方法
DoubleToIntFunction	  代表了接受单个Double类型参数但返回Int类型结果的方法
DoubleToLongFunction  代表了接受单个Double类型参数但返回Long类型结果的方法
DoubleUnaryOperator	  代表了基于单个Double类型操作数且产生Double类型结果的操作
Function	          代表了接受一个参数并且产生一个结果的方法
IntBinaryOperator	  代表了对两个Int类型操作数的操作，并且产生一个Int类型的结果
IntConsumer	          代表了接受单个Int类型参数的操作，没有返回结果
IntFunction	          代表了接受Int类型参数并且给出返回值的方法
IntPredicate	      代表了对单个Int类型参数的断言操作
```