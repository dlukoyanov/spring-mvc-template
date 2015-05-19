package com.meduzka.template.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    private final static Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/")
    public ModelAndView pageServlet(){
        ModelAndView modelAndView = new ModelAndView("page");
        return modelAndView;
    }
}
