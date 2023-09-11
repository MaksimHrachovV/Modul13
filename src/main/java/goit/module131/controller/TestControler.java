package goit.module131.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestControler {
    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public ModelAndView getTest(){
        ModelAndView result = new ModelAndView("test");
        result.addObject("world", "Hello, World");
        return result;
    }
}