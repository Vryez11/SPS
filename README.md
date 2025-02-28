# Spring 공부

## 스프링 입문 - 스프링 부트, 웹 MVC, DB 접근 기술
+ 스프링 웹 개발 기초
  + 정적 컨텐츠
  + MVC와 템플릿 엔진
  + API
+ 회원 관리 예제 - 백엔드 개발
  + 회원 서비스 개발
  + 회원 서비스 단위 테스트
+ 스프링 빈과 의존관계
  + 컴포넌트 스캔과 자동 의존관계 설정
  + 자바 코드로 직접 스프링 빈 등록하기
+ 회원 관리 예제 - 웹 MVC 개발
+ 스프링 DB 접근 기술
  + H2 데이터베이스
  + 순수 JDBC
  + 스프링 통합 테스트
  + JDBCTemplate
  + JPA
  + 스프링 데이터 JPA
+ AOP
  + AOP 적용

## 스프링 핵심 원리 - 기본
+ 객체 지향 설계과 스프링
  + 스프링이란?
  + 좋은 객체 지향 프로그래밍이란?
  + 좋은 객체 지향 설계의 5가지 원칙 (SOLID)
+ 예제 만들기
  + 회원 도메인 설계 / 개발 / 실행 / 테스트
  + 주문과 할인 도메인 설계 / 개발 / 실행 / 테스트
+ 예제 객체 지향 원리 적용
  + 관심사의 분리
  + AppConfig 리펙터링
  + IoC, DI, 컨테이너
+ 스프링 컨테이너와 스프링 빈
  + 스프링 컨테이너 생성 / 컨테이너에 등록된 모든 빈 조회
  + 스프링 빈 조회 기본 / 동일한 타입이 둘 이상 / 상속 관계
  + 스프링 빈 설정 메타 정보 - BeanDefinition
+ 싱글톤 컨테이너
  + 싱글톤 패턴 / 싱글톤 컨테이너
  + @Configuration과 싱글톤 / @Configuration과 바이트코드 조작
+ 컴포넌트 스캔
  + 컴포넌트 스캔과 의존관계 자동 주입
  + 탐색 위치와 기본 스캔 대상 / 팔터 / 중복 등록과 충돌
+ 의존관계 자동 주입
  + 다양한 의존관계 주입 방법
  + 롬복과 최신 트렌드
  + 조회 빈이 2개 이상 - 문제 / @Autowired 필드 명, @Qualifier, @Primary
  + 애노테이션 직접 만들기
+ 빈 생명주기 콜백
  + 인터페이슨 InitializingBean, DisposableBean
  + 애노테이션 @PostConstruct, @PreDestroy
+ 빈 스코프
  + 프로토타입 스코프 / 싱글톤 빈과 함께 사용시 문제점 / Provider 문제 해결
  + 웹 스코프 / request 스코프 예제 / 에러 / Provider, 프록시 해결
