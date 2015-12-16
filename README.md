# camunda engine unit test template

The project contains the following files:

```
src/
├── main
│   ├── java
│   └── resources
└── test
    ├── java
    │   └── org
    │       └── camunda
    │           └── bpm
    │               └── unittest
    │                   └── SimpleTestCase.java   (1)
    └── resources
        ├── camunda.cfg.xml                       (2)
        └── testProcess.bpmn                      (3)
```
Explanation:

* (1) A java class containing a JUnit Test. It uses the `ProcessEngineRule` for bootstrapping the process engine, as well as [camunda-bpm-assert][assert] to make your test life easier.
* (2) Configuration file for the process engine.
* (3) An example BPMN process.

https://github.com/camunda/camunda-bpm-assert/blob/master/camunda-bpm-assert/README.md

## Running the test with maven

In order to run the testsuite with maven you can say:

```
mvn clean test
```

[assert]: https://github.com/camunda/camunda-bpm-assert
