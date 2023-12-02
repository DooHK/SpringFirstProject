package com.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl {
    BoardDAO boardDAO;
    public int insertBoard(BoardVO vo){
        return boardDAO.insertBoard(vo);
    }
    public int deleteBoard(int seq){
        return boardDAO.deleteBoard(seq);
    }
    public int updateBoard(BoardVO vo){
        return boardDAO.updateBoard(vo);
    }
    public BoardVO getBoard(int seq){
        return boardDAO.getBoard(seq);
    }
    public List<BoardVO> getBoardList(){
        return boardDAO.getBoardList();
    }
}
