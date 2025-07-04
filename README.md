# spring-docker-pipeline
Spring Boot 애플리케이션을 Docker 기반으로 REST API를 테스트하는 프로젝트입니다.

## 폴더 구조
<pre>
├── Dockerfile
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── example
                    └── demo
                        ├── DemoApplication.java
                        └── HelloController.java  
</pre>

### 사용 기술
- Spring boot
- Docker
- curl (API 테스트)
<pre>
  ### API 예제
#### GET 요청
curl http://localhost:8080/hello

#### 응답
Hello from Spring Boot!

#### POST 요청
curl -X POST http://localhost:8080/hello -H "Content-Type: text/plain" -d "ChatGPT"
  
#### 응답
Hello, ChatGPT!
</pre>

## 기타
- WSL환경에서 작업하였습니다.
- 향후 DB 연동, CI/CD 추가 예정
