/**
 *
 */
package com.springmvc.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ikki_nozawa
 *
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String indexGet() {
        System.out.println("GETでのリクエスト");
        return "index";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String indexPost() {
        System.out.println("POSTでのリクエスト");
        return "index";
    }
}
