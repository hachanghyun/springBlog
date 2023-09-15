## 1. Deployment URL
  https://github.com/hachanghyun/springBlog
  
## 2. Summary
### 주요 기능

## 3. Meaning
    
## 4. Technology Stacks
    Frontend : thymleaf
    
    Backend : SpringBoot_2.7.1, SpringData JPA, JAVA_11, Gradle
    
    Database : MariaDB

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

#### 텍스트 블록
    String query17 = """ SELECT ~~~~ """;

#### formatted()메서드 제공

#### 레코드
    레코드는 데이터 전달을 목적으로 하는 객체를 더 빠르고 간편하게 만들기 위한 기능입니다.
    레코드는 상속을 할 수 없고 파라미터에 정의한 필드는 private final로 정의됩니다. 
    또한 레코드는 getter를 자동으로 만들기 때문에 애너테이션이나 메서드로 getter 정의를 하지 않아도 됩니다.

#### 패턴매칭
    패턴매칭은 타입 확인을 위해 사용하던 instanceof 키워드를 조금 더 쉽게 사용할 수 있게 해줍니다.
    이전에는 instanceof 키워드와 형변환 코드를 조합해야 했지만 이제는 바로 형변환을 한 다음 사용할 수 있습니다.

#### 자료형애 맞는 case 처리

#### Servlet, JPA의 네임 스페이스가 jakarta로 대체

#### GraalVM 기반의 스프링 네이티브 공식 지원
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
    

