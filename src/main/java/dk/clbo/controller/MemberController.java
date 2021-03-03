package dk.clbo.controller;

import dk.clbo.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    // Attribut
    private Member member;

    // Controller
    public MemberController() {
        this.member = new Member("clbo", "1234");
    }

    // Metode
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("xxx", member);
        return "hello";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Member mem){
        this.member = mem;
        return "redirect:/";
    }

}
