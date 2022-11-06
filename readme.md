# ReadonlyCollections
Java 언어는 컴파일 시점에서 평가되는 readonly 컬렉션류들을 지원하지 않습니다. <br>
이 프로젝트는 Java에서 제공하는 컬렉션류들의 readonly를 제공합니다.

# 빠른 시작
```java
HashTable<String, String> source = new HashTable<String, String>();

ReadOnlyMap<String, String> readonlySource = ReadOnlyCollections.to(source);
```

df
df
sd
