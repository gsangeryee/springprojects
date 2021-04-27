# Spring Projects
## Samples
Spring samples by functions.
### hello spring 
### datasource demo
- Dependencies: 
    - Actuator
    - H2
    - JDBC
    - Lombok
    - Web
### pure datasource demo
Connect database only using JDBC, no spring boot
- Dependencies:
    - Commons-dbcp2
    - H2
    - Spring Context
    - Spring JDBC
### multi datasource demo
Connect two different databases

### druid Demo
Using Druid as a database connection pool.
Customized a filter to print logs before and after connection respectively.
- Dependencies: 
  - actuator
  - jdbc
  - h2
  - lombok
  - druid
  exclusion
  - HikariCP

### Simple JDBC Demo
- Using JdbcTemplate to insert and update databases
- Simplify basic Entity code with Lombok
- Using SimpleJdbcInsert
- Two Method to Batch Insert data.
  - JdbcTemplate.batchUpdate
  - NamedParameterJdbcTemplate.batchUpdate


## Projects
### Spring Coffee

## Tools

IDE
- IntelliJ IDEA CE
- Visual Studio Code

Testing API

- VSCODE API Testing Plugin: [https://www.thunderclient.io/](https://www.thunderclient.io/)
- POSTMAN

IDEA Plugins

- [TabNine For IntelliJ](https://www.tabnine.com/install/intellij): AI Completions for IntelliJ
- [Maven Helper](https://plugins.jetbrains.com/plugin/7179-maven-helper): Dependency Analyzer