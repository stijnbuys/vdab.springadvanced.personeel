package be.vdab.personeel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController
{
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
