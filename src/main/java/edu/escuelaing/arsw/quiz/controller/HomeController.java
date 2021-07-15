package edu.escuelaing.arsw.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Spring.io
 */
@Controller
public class HomeController 
{
    @RequestMapping("/")
    public @ResponseBody String greeting () 
    {
        return "Hello, World";
    }
}
