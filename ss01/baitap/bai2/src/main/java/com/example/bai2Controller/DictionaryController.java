package com.example.bai2Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class DictionaryController {
    @GetMapping("/list")
    public String list(){
        return "list";
    }
    @PostMapping("/test")
    public String display(Model model , String eng){
        Map<String,String> map = new HashMap<>();
        map.put("hello","xin chao");
        map.put("bye","tam biet");
        map.put("dog","chó");
        map.put("cat","mèo");
        map.put("mother","mẹ");
        Set<String> set = map.keySet();
        String result = "";
        for (String s: set) {
            if (s.equalsIgnoreCase(eng)){
                result = map.get(s);
                break;
            }
        }
        model.addAttribute("eng",eng);
        model.addAttribute("vn",result);
        return "list";
    }
}
