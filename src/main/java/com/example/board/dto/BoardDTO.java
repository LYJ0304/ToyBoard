package com.example.board.dto;

import com.example.board.entity.BaseEntity;
import com.example.board.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object)
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    public static BoardDTO toboardDTO(BoardEntity boardEntity, BaseEntity baseEntity) {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(boardEntity.getId());
        boardDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDTO.setBoardPass(boardEntity.getBoardPass());
        boardDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDTO.setBoardContents(boardEntity.getBoardContents());
        boardDTO.setBoardHits(boardEntity.getBoardHits());
        boardDTO.setBoardCreatedTime(baseEntity.getCreatedTime());
        boardDTO.setBoardUpdatedTime(baseEntity.getUpdatedTime());
        return boardDTO;
    }
}
