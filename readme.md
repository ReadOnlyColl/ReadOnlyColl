[![Continous Integration](https://github.com/sang-hyeon/Java-ReadOnlyCollections/actions/workflows/continous-integration.yml/badge.svg)](https://github.com/sang-hyeon/Java-ReadOnlyCollections/actions/workflows/continous-integration.yml)

# ReadOnlyCollections
Java (J2SE) does not support read-only collections that are evaluated at compile time. <br>
This project provides it.

# Supported Collections
* [ReadOnlyCollection](lib/src/main/java/readonlycollections/ReadOnlyCollection.java)
* [ReadOnlyList](lib/src/main/java/readonlycollections/ReadOnlyList.java)
* [ReadOnlyMap](lib/src/main/java/readonlycollections/ReadOnlyMap.java)
* (Coming soon...)

# Quick Start
```java

var source = new ArrayList<String>();

ReadOnlyList<String> readonlySource = ReadOnly.of(source);

```
