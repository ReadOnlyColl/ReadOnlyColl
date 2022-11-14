[![Continous Integration](https://github.com/ReadOnlyColl/ReadOnlyColl/actions/workflows/continous-integration.yml/badge.svg)](https://github.com/ReadOnlyColl/ReadOnlyColl/actions/workflows/continous-integration.yml)

# ReadOnlyCollections
Java (J2SE) does not support read-only collections that are evaluated at compile time. <br>
This project provides it.

## Supported Collections
* [ReadOnlyCollection](readonlycoll/src/main/java/readonlycollections/ReadOnlyCollection.java)
* [ReadOnlyList](readonlycoll/src/main/java/readonlycollections/ReadOnlyList.java)
* [ReadOnlyMap](readonlycoll/src/main/java/readonlycollections/ReadOnlyMap.java)
* [ReadOnlySet](readonlycoll/src/main/java/readonlycollections/ReadOnlySet.java)

## Quick Start
```java

var source = new ArrayList<String>();

ReadOnlyList<String> readonlySource = ReadOnly.of(source);

```

## Install

### Maven

```xml
<dependency>
  <groupId>io.github.readonlycoll</groupId>
  <artifactId>readonlycoll</artifactId>
  <version>0.1.4</version>
</dependency>
```

### Gradle

```groovy
implementation 'io.github.readonlycoll:readonlycoll:0.1.4'
```
