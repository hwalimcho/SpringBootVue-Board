package com.vue.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vue.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;
    
    @Override
    public List<Map<String, Object>> boardList() throws Exception {
        // TODO Auto-generated method stub
        return boardMapper.boardList();
    }
}

