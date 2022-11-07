[![Continous Integration](https://github.com/sang-hyeon/Java-ReadonlyCollections/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/sang-hyeon/Java-ReadonlyCollections/actions/workflows/ci.yml)

# ReadonlyCollections
Java 언어는 컴파일 시점에서 평가되는 readonly 컬렉션류들을 지원하지 않습니다. <br>
이 프로젝트는 컴파일 시점에서 평가되는 기본적인 readonly 컬렉션류들을 제공합니다.

# Supported Collections
* [ReadOnlyCollection](lib/src/main/java/readonlycollections/ReadOnlyCollection.java)
* [ReadOnlyList](lib/src/main/java/readonlycollections/ReadOnlyList.java)
* [ReadOnlyMap](lib/src/main/java/readonlycollections/ReadOnlyMap.java)
* (Coming soon...)

# Quick Start
```java
HashTable<String, String> source = new HashTable<String, String>();

ReadOnlyMap<String, String> readonlySource = ReadOnly.to(source);
```
