package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

//    public BoardController(BoardService service) {
//        this.service = service;
//    }

    @GetMapping("/list")  // board/list
    public void list(Model model) {
        // db 에서 가지고 온 것 있어야 함.
        // Controller --> Service --> dao
        log.info("===============> BoardController /list");
        // "list"가 request 객체로 전달
        model.addAttribute("list", boardService.getList());
        // 요청한 주소와 views의 호출할 파일명이 같으면 return 안 해도 됨.
    }

    @GetMapping({"/get", "/update"})
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("/get or update");
        model.addAttribute("board", boardService.get(no));
    }

    @GetMapping("/create")
    public void create() {
        log.info("create");
    }

    @PostMapping("/create")
    public String create(BoardDTO board) {
        log.info("create: " + board);
        boardService.create(board);
        return "redirect:/board/list";
    }

    @PostMapping("/update")
    public String update(BoardDTO board) {
        log.info("update:" + board);
        boardService.update(board);
        return "redirect:/board/list";
    }

}