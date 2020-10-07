Java JSON Serializers Write Benchmarks
-----------------------------------

JMH benchmark project testing performance of

* JRE `StringBuilder`
* JRE `StringBuffer`
* JRE `String.+`
* Jackson Databind JSON
* DSL Platform JSON (Java 8) - https://github.com/ngs-doo/dsl-json

approaches to serializing

```
{
  "id": <long>,
  "name": "String",
  "UUID": "String",
  "number": <decimal>
}
```

to JSON string.
