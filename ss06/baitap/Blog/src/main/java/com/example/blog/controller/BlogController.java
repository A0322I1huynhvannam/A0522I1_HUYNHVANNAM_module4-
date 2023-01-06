package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    IBlogService blogService;
    @GetMapping("/list")
    public String index(Model model){
        List<Blog> blogList = blogService.getAll();
        model.addAttribute( "listBlog",blogList );
        return "index";
    }
    @GetMapping("/create")
    public  String create(Model model){
        model.addAttribute( "blog",new Blog() );
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute ("blog") Blog blog){
        blogService.save( blog );
        return "redirect:/blog/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id , Model model){
        model.addAttribute( "blog",blogService.findByIdMy( id ) );
        return "delete";
    }
    @PostMapping("/remove")
    public String remove(@ModelAttribute ("blog") Blog blog, Model model){
        blogService.deleteById(blog.getId());
        model.addAttribute("mes","Xoa thanh cong");
        return "redirect:/blog/list";
    }
    @GetMapping("/edit/{id}")
    public  String edit(@PathVariable("id") Integer id,Model model){
        model.addAttribute( "blog",blogService.findByIdMy( id ) );
        return "edit";
    }
    @PostMapping("update")
    public String update(@ModelAttribute("blog") Blog blog,Model model){
        blogService.save( blog );
        model.addAttribute( "mes","xoa thanh cong" );
        return "redirect:/blog/list";
    }
}
