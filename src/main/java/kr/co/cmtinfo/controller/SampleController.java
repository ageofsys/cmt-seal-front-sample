package kr.co.cmtinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/")
    String welcome() { return "pages/welcome"; }

    @GetMapping("/theme")
    String theme() { return "pages/theme"; }



}
