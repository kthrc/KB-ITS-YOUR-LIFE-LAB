package org.scoula.board.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // views로 넘어가지 않고 모두 data로 응답하겠다(Controller + ResponseBody)
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Log4j2
@Api(tags="게시글 관리")
public class BoardController {
    private final BoardService service;

    @ApiOperation(value="게시글 목록", notes = "게시글 목록을 얻는 API")
    @GetMapping("") // ==> /api/board
    //@ResponseBody//컨트롤러에서 views로 넘어가지 않고
    //http의 body에 리턴값을 넣어서 응답해라!
    public ResponseEntity<List<BoardDTO>> getList(){
        return ResponseEntity.ok(service.getList());
    }

    @GetMapping("/get") // ==> /api/board/get?no=1
    public BoardDTO get(@RequestParam("no") Long no){
        return service.get(no);
    }

    @ApiOperation(value="상세정보 얻기", notes = "게시글 상세 정보를 얻는 API")
    @GetMapping("/get/{no}") // ==> /api/board/get/15
    public BoardDTO get2(
            @ApiParam(value="게시글 ID", required = true, example = "1")
            @PathVariable Long no){
        return service.get(no);
    }


    @PostMapping("")
    public ResponseEntity<BoardDTO> create(
            @ApiParam(value="게시글 객체", required = true)
            @RequestBody BoardDTO dto){
        // @RequestBody
        //
        return ResponseEntity.ok(service.create(dto));
    }
}

