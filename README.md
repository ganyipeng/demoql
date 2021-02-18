# demoql

## How to run

#### Db file

Put the data file somewhere, say ~/data.mv.db

#### Change application properities

Change the line of the location of the data file

```
spring.datasource.url=jdbc:h2:file:~/data
```

#### Run

```
mvn spring-boot:run
```

#### Query

Use postman or [graphiql](https://www.electronjs.org/apps/graphiql) to post a query

``` graphql
{
  allContracts{
    contractId
    client{
      clientName
    }
    latestRisk {
      level
      date
    }
  }
}
```

http-request-demo
* http-url: http://47.242.91.244:8080/graphiql
* http-method: post
* http-body
  ``` json
  {
    "query":"{\n allContracts{\n contractId\n client{\n clientName\n }\n latestRisk {\n level\n date\n }\n }\n}",
    "variables":null,
    "operationName":null
  }
  ```
