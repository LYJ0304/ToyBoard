package com.example.board.service;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// DB의 테이블 역할을 하는 클래스
@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity {
    @Id // JPA가 엔티티를 식별하고, 영속성 컨텍스트에서 캐시하거나 조회할 때 기준이 되는 필수 요소임
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 매번 ID를 수동으로 지정하지 않아도 되게 해주어 편리하고, 충돌 방지에도 도움됨
    private Long id;

    @Column(length = 20, nullable = false) // 크기 20, not null
    private String boardWriter;

    @Column // 크기 255, null 가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;
}
