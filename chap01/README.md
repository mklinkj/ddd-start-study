# Chapter 1 도메인 모델 시작하기

> ✨ Spring Security는 좀 나중에 보더라도  확실히 이걸 아는게 급한 것 같다. 











## 챕터 진행



### 사용할 DB 생성

일단 MySQL만 사용해보자.

```sql
CREATE SCHEMA `ddd_start_study` DEFAULT CHARACTER SET utf8mb4 ;

CREATE USER 'ddduser'@'localhost' IDENTIFIED BY 'dddpass';
CREATE USER 'ddduser'@'%' IDENTIFIED BY 'dddpass';

GRANT ALL PRIVILEGES ON ddd_start_study.* TO 'ddduser'@'localhost';
GRANT ALL PRIVILEGES ON ddd_start_study.* TO 'ddduser'@'%';
```



### 프로젝트 준비

* https://start.spring.io/ 에서 Spring Boot 3.0 기반으로 추가했다.
  * web, security, jpa, mail, thymeleaf, devtools
  * mybatis : 나중에 쓰시는 데가 있나?

* 프로젝트는 하나를 가지고 계속 내용 추가해나가는 것이므로, 단일 프로젝트로 두자!

  * [ddd-start-study 프로젝트](../ddd-start-study)

* 프로젝트 실행

  * 웹실행

    ```bash
    gradlew clean bootRun
    ```

    아무것도 한게 없고 Spring Security 만 붙어있어서 로그인 페이지만 뜬다.

  * 테스트 실행

    ```bash
    gradlew clean test --tests *DddStartStudyApplicationTests.contextLoads
    ```

    

  



## 정오표

* ...
