## 1. Deployment URL
  https://github.com/hachanghyun/springBlog
  
## 2. Summary
### 주요 기능

#### (1). 로그인 회원가입 화면입니다.
<img width="1438" alt="스크린샷 2023-09-16 오후 9 10 17" src="https://github.com/hachanghyun/springBlog/assets/33058284/3bb7335e-b7e9-4543-b8cb-cfe96198eadf">
<img width="1439" alt="스크린샷 2023-09-16 오후 9 10 24" src="https://github.com/hachanghyun/springBlog/assets/33058284/0f869328-5290-49bc-a3b1-e0823560e6fd">

#### (2).블로그 메인 화면입니다. 
<img width="1436" alt="스크린샷 2023-09-16 오후 9 19 51" src="https://github.com/hachanghyun/springBlog/assets/33058284/9e9931bb-9b0f-4fd9-b812-32fc1e618658">

#### (3). 블로그 글 등록화면 입니다.
<img width="1439" alt="스크린샷 2023-09-16 오후 9 20 33" src="https://github.com/hachanghyun/springBlog/assets/33058284/01a9e600-adcd-41b6-8213-971ea32567f9">

#### (4). 블로그 글 수정화면입니다.
<img width="1440" alt="스크린샷 2023-09-16 오후 9 20 14" src="https://github.com/hachanghyun/springBlog/assets/33058284/813edcd8-9d3a-4044-ad58-744b5b38b1f4">

#### (5). 블로그 글 삭제화면입니다.
<img width="1440" alt="스크린샷 2023-09-16 오후 9 20 24" src="https://github.com/hachanghyun/springBlog/assets/33058284/57ec3cdc-aab5-49f8-b4e4-a037739ba4d3">

#### (6). swagger test 화면입니다.
<img width="1431" alt="스크린샷 2023-09-16 오후 9 20 55" src="https://github.com/hachanghyun/springBlog/assets/33058284/45ebf018-0466-4680-88d9-36d2aec9b5ce">



## 3. Meaning
    스프링부트3버전으로 기본적인 블로그를 만들어보았다. 기본적인 CRUD기능과 JPA를 활용하여 제작하였으며 스프링 시큐리티 개념에 대해
    정리할수 있는 좋은 기회가 되었다.
    
## 4. Technology Stacks
    Frontend : thymeleaf
    
    Backend : SpringBoot_3.0.2, SpringData JPA, JAVA_17, Gradle
    
    Database : h2

## 5. Develop Environment

### (1).스프링 개념정리

#### IOC
    객체의 생성과 관리를 개발자가 하는 것이 아니라 프레임워크가 대신하는 것

#### DI
    외부에서 객체를 주입받아 사용하는 것

#### AOP
    프로그래밍을 할 때 핵심 관점과 부가 관점을 나누어서 개발하는 것

#### PSA
    어느 기술을 사용하던 일관된 방식으로 처리하도록 하는 것

### (2).스프링부트 스타터 

#### spring-boot-starter-web
    spring MVC를 사용해서 RESTful 웹 서비스를 개발할 때 필요한 의존성 모음

#### spring-boot-starter-test
    스프링 애플리케이션을 테스트하기 위해 필요한 의존성 모음

#### spring-boot-starter-validation
    유효성 검사를 위해 필요한 의존성 모음

#### spring-boot-starter-actuator
    모니터링을 위해 애플리케이션에서 제공하는 다양한 정보를 제공하기 쉽게 하는 의존성 모음

#### spring-boot-starter-data-jpa
    ORM을 사용하기 위한 인터페이스의 모음인 JPA를 더 쉽게 사용하기 위한 의존성 모음

### (3).자바17 특징

#### (a).텍스트 블록
    String query17 = """ SELECT ~~~~ """;

#### (b).formatted()메서드 제공

#### (c).레코드
    레코드는 데이터 전달을 목적으로 하는 객체를 더 빠르고 간편하게 만들기 위한 기능입니다.
    레코드는 상속을 할 수 없고 파라미터에 정의한 필드는 private final로 정의됩니다. 
    또한 레코드는 getter를 자동으로 만들기 때문에 애너테이션이나 메서드로 getter 정의를 하지 않아도 됩니다.

#### (d).패턴매칭
    패턴매칭은 타입 확인을 위해 사용하던 instanceof 키워드를 조금 더 쉽게 사용할 수 있게 해줍니다.
    이전에는 instanceof 키워드와 형변환 코드를 조합해야 했지만 이제는 바로 형변환을 한 다음 사용할 수 있습니다.

#### (e).자료형애 맞는 case 처리

#### (f).Servlet, JPA의 네임 스페이스가 jakarta로 대체

#### (g).GraalVM 기반의 스프링 네이티브 공식 지원
    스프링부트 3.0 부터는 GraalVM네이티브 이미지를 공식 지원합니다. 
    기존에 사용하던 자바 가상머신에 비해 훨씬 빠르게 시작되며 더 적은 메모리 공간을 차지합니다.
    JVM 실행 파일과 비교해 네이티브 이미지를 사용하면 가동 시간이 짧아지고 메모리를 더 적게 소모합니다.

### (4). @SpringBootApplication

#### @SpringBootConfiguration
    스프링 부트관련 설정을 나타내는 애너테이션.
    @Configuration을 상속해서 만든 애너테이션.

#### @ComponentScan
    사용자가 등록한 빈을 읽고 등록하는 애너테이션입니다.
    이 애너테이션은 @Component라는 애너테이션을 가진 클래스들을 찾아 빈으로 등록하는 역할을합니다.
    @Configuration : 설정파일 등록
    @Repository : ORM 매핑
    @Controller, @RestController : 라우터
    @Service : 비즈니스 로직

#### @EnableAutoCOnfiguration
    스프링 부트에서 자동 구성을 활성화하는 애너테이션입니다. 이 애너테이션은 스프링 부트 서버가 실행될 때 
    스프링 부트의 메타 파일을 읽고 정의된 설정들을 자동으로 구성하는 역할을 수행합니다.
    자동 구성에서 살펴본 spring.factories 파일에 클래스들이 모두 @EnableAutoConfiguration을 사용할 때 자동 설정됩니다.

### (5). 테스트 컨트롤러 살펴보기

#### @RestController
    라우터란 HTTP 요청과 메서드를 연결하는 장치

#### @Component 애너테이션
    컴포넌트 애너테이션이 있는 클래스는 빈으로 등록되며, @Controller, @RestController, @Configuration, @Repository, @Service 모두 @Component 애너테이션을 가지고 있습니다.
    
### (6).테스트 코드

#### given - when - then 패턴
    테스트 실행을 준비하는 단계
    테스트를 진행하는 단계
    테스트 결과를 검증하는 단계

    
#### @BeforeAll 
    전체 테스트를 시작하기 전에 처음으로 한 번만 실행합니다.
    예를 들어 데이터베이스를 연결해야 한거나 테스트 환경를 초기화할대 사용됩니다. 
    이 애너테이션은 전체 테스트 실행 주기에서 한번만 호출되어야 하기 떄문에 메서드를 static으로 선언해야합니다.

#### @BeforeEach 
    테스트 케이시를 시작하기 전에 매번 실행합니다.
    예를들어 테스트 메서드에서 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣을때 사용할 수 있습니다.

#### AfterAll 
    전체 테스트를 마치고 종료하기 전에 한 번만 실행합니다.
    예를 들어 데이터베이스 연결을 종료할때나 공통적으로 사용하는 자원을 해제할때 사용
    전체 테스트 실행주기에서 한번만 호출. static 선언 

#### AfterEach
각 테스트 케이스를 종료하기 전 매번 실행

#### @SpringBootTest
    @SpringBootTest 는 메인 애플리케이션 클래스에 추가하는 애너테이션인 @SpringBootApplication
    이있는 클래스를 찾고 그 클래스에 포함되어 있는 빈을 찾은 다음 테스트용 애플리케이션 컨텍스트라는 것을
    만듭니다.

#### @AutoConfigureMockMvc
    MocoMvc를 생성하고 자동으로 구성하는 애너테이션
    컨트롤러 테스트할때 사용하는 클래스

#### @BeforeEach 
    테스트를 실핼하기 전에 싱행하는 메서드에 적용하는 애너테이션

#### @AfterEach
    테스트를 실행한 이후에 실행하는 메서드에 적용하는 애너테이션.


### (7). RestAPI (Represeintational State Transfer)
    자원을 이름으로 구분해 자원의 상태를 주고받는 API

    URL에는 동사를 쓰지말고 자원을 표시ㅣ해야 한다
    동사는 HTTP메서드로 표현
    GET : 조회
    POST : 추가
    PUT : 수정
    DELETE : 삭제

### (8). 엔티티 구성하기

#### 빌더 패턴
    생성자위에 입려하면 빌더 패턴 방식으로 객체를 생성할 수 있어 편리
    어느 필드에 어떤 값이 들어가는지 명시적으로 파악가능
    
### (9). HTTP 응답코드 정리
    200 OK : 요청이 성공적으로 수행되었음
    201 Created : 요청이 성공적으로 수행되었고, 새로운 리소스가 생성되었음
    400 Bad Request : 요청값이 잘못되어 요청에 실패했음
    403 Forbidden : 권한이 없어 요청에 실패했음
    404 Not Found : 요청값으로 찾은 리소스가 없어 요청에 실패했음
    500 Internal Server Error : 서버상에 문제가 있어 요청에 실패했음

<img width="622" alt="화면 캡처 2023-09-16 144612" src="https://github.com/hachanghyun/springBlog/assets/33058284/4674956a-c9bd-45d7-a461-938682c2654d">

### (10). 스프링 시큐리티

#### 인증과 인가
    인증은 사용자의 신원을 입증하는 과정
    인가는 사이트의 특정 부분에 접근할 수 있는지 권한을 확인하는 작업

#### WebSecurityConfig 설정
    requestMatchers() : 특정 요청과 일치하는 url에 대한 액세스를 설정합니다.
    permitAll() : 누구나 접근이 가능하게 설정합니다. 즉 "/login" , "/signup" , "/user" 로 요청이 오면 인증/인가 없이도 접근할 수 있습니다.
    anyRequest() : 위에서 설정한 url 이외의 요청에 대해서 설정합니다.
    authenticated() : 별도의 인가는 필요하지 않지만 인증이 성공된 상태여야 접근할 수 있습니다.

    loginPages() : 로그인 페이지 경로를 설정합니다
    defaultSuccessUrl() : 로그인이 완료되었을 때 이동할 경로를 설정합니다.

    logoutSuccessUrl() : 로그아웃이 완료되었을 때 이동할 경로를 설정합니다.
    invalidateHttpSession() : 로그아웃 이후에 세션을 전체 삭제할지 여부를 설정합니다.

    userDetailsService() : 사용자 정보를 가져올 서비스를 설정합니다. 이때 설정하는 서비스 클래스는 반드시 UserDetailsService를 상속받은 클래스여야 합니다.
    passwordEncoder() : 비밀번호를 암호화하기 위한 인코더를 설정합니다.

<img width="614" alt="화면 캡처 2023-09-16 193317" src="https://github.com/hachanghyun/springBlog/assets/33058284/d86eb5af-4816-4378-9d09-4a180d1e1829">
<img width="610" alt="화면 캡처 2023-09-16 192556" src="https://github.com/hachanghyun/springBlog/assets/33058284/fa7c940d-3d67-4136-84ff-f5875e7c38bf">
<img width="629" alt="화면 캡처 2023-09-16 192535" src="https://github.com/hachanghyun/springBlog/assets/33058284/1775eb11-7877-43ff-86e4-79afbf5ee7c9">
<img width="622" alt="화면 캡처 2023-09-16 144612" src="https://github.com/hachanghyun/springBlog/assets/33058284/e32e6f31-b54d-4470-bf0b-132349bb559a">

## 6. 기타
### 참조사이트

##### swagger 
##### https://resilient-923.tistory.com/414

##### H2 DB
##### http://localhost:8080/h2-console/login.jsp?jsessionid=95356a8a9feeef80dc6197cab8c19b50
