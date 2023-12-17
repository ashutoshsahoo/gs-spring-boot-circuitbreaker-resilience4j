package com.ashu.practice.web;

import com.ashu.practice.service.impl.AlbumServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/albums")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumServiceImpl businessAService;

    @GetMapping("failure")
    public String failure() {
        return businessAService.failure();
    }

    @GetMapping("success")
    public String success() {
        return businessAService.success();
    }

    @GetMapping("successException")
    public String successException() {
        return businessAService.successException();
    }

    @GetMapping("ignore")
    public String ignore() {
        return businessAService.ignoreException();
    }

    @GetMapping
    public String albums() {
        return businessAService.getAlbumList();
    }
}
