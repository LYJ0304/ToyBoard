package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.entity.BaseEntity;
import com.example.board.entity.BoardEntity;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// DTO -> Entity
// Entity -> DTO

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }

    public List<BoardDTO> findAll() {
        List<BoardEntity> boardEntityList = boardRepository.findAll();
        List<BoardDTO> boardDTOList = new ArrayList<>();
        BaseEntity baseEntity = new BaseEntity();
        for (BoardEntity boardEntity: boardEntityList) {
            boardDTOList.add(BoardDTO.toboardDTO(boardEntity, baseEntity));
        }
        return boardDTOList;
    }
}
