package com.keills.cyphers.controller;

import com.keills.cyphers.algorithms.Caesar;
import com.keills.cyphers.algorithms.Gamma;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/caesar")
    public String toReplace(){
        return "caesar";
    }

    @PostMapping("/caesar/")
    public String encode(@RequestParam(value = "input",required = false) String input, @RequestParam(value = "key",required = false) int key, @RequestParam(value = "decode",required = false) boolean decoding, Model model){
        String result = "";
        if(decoding)
            result = Caesar.decode(input,key);
        else
            result = Caesar.encode(input,key);
        model.addAttribute("result", result);
        return "caesar";
    }

    @GetMapping("/gamma")
    public String toGamma(){
        return "gamma";
    }

    @PostMapping("/gamma/")
    public String encode(@RequestParam(value = "input",required = false) String input, @RequestParam(value = "key",required = false) String key, Model model){
        String result = "";
        result = Gamma.execute(input,key);
        model.addAttribute("result", result);
        return "gamma";
    }
}
