# ToyBoard

간단한 게시판 기능을 제공하는 Java 기반의 웹 프로젝트입니다. 게시글 작성, 조회, 목록, 삭제 기능 등을 구현하며, Spring Boot와 Thymeleaf 기반으로 구성되어 있습니다.

## 📌 주요 기능

- 게시글 등록
- 게시글 상세 조회
- 게시글 목록 출력
- 게시글 삭제
- 게시글 조회수 증가 기능

## 🛠 기술 스택

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- Thymeleaf
- MySQL
- Gradle

## 📂 프로젝트 구조

```plaintext
src/
└── main/
    ├── java/
    │   └── com.example.board/
    │       ├── controller/   # 웹 요청 처리
    │       ├── dto/          # DTO 클래스
    │       ├── entity/       # JPA 엔티티 클래스
    │       ├── repository/   # 데이터베이스 액세스
    │       └── service/      # 비즈니스 로직
    └── resources/
        ├── static/           # 정적 리소스 (CSS, JS 등)
        ├── templates/        # Thymeleaf HTML 파일
        └── application.yml   # 설정 파일
```
