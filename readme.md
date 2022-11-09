[![Continous Integration](https://github.com/sang-hyeon/Java-ReadOnlyCollections/actions/workflows/continous-integration.yml/badge.svg)](https://github.com/sang-hyeon/Java-ReadOnlyCollections/actions/workflows/continous-integration.yml)

# ReadOnlyCollections
Java (J2SE) does not support read-only collections that are evaluated at compile time. <br>
This project provides it.

## Supported Collections
* [ReadOnlyCollection](lib/src/main/java/readonlycollections/ReadOnlyCollection.java)
* [ReadOnlyList](lib/src/main/java/readonlycollections/ReadOnlyList.java)
* [ReadOnlyMap](lib/src/main/java/readonlycollections/ReadOnlyMap.java)
* (Coming soon...)

## Quick Start
```java

var source = new ArrayList<String>();
df
ReadOnlyList<String> readonlySource = ReadOnly.to(source);

```

## Install

### Maven

```xml
<dependency>
  <groupId>io.github.sang-hyeon</groupId>
  <artifactId>readonlycoll</artifactId>
  <version>0.1.2</version>
</dependency>
```

### Gradle

```groovy
implementation 'io.github.sang-hyeon:readonlycoll:0.1.2'
```
