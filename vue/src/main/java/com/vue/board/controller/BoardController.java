package com.vue.board.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vue.board.service.BoardService;

@RestController
public class BoardController {
    
    @Resource
    private BoardService boardService;
    
    @RequestMapping(value="list")
    public ModelAndView AllListView(Map<String, Object> map) throws Exception {
        ModelAndView mav = new ModelAndView();
        
        List<Map<String,Object>> AllList = boardService.boardList();
        
        
        mav.addObject("Alllist", AllList);
        mav.setViewName("board/list");
        
        System.out.println("ㅇㅇㅇ ======" + AllList);
        return mav;
        }
}