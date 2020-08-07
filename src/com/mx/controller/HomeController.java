package com.mx.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.to.UserTo;

@Controller
@RequestMapping(value="/homeController")
public class HomeController {

    @RequestMapping(value="/homeGet", method = RequestMethod.GET)
    public @ResponseBody String home(HttpServletResponse response)
    {
            System.out.println("Dentro del Home2222");
            response.addHeader("Access-Control-Allow-Origin", "*");
            //return "[{ \"id\": 104234212 }]";
            return "[{ \"id\": 104234212,\"nombre\": \"Rodrigo\" },{ \"id\": 2222222,\"nombre\": \"Coco\" }]";

    }

    @RequestMapping(value="/homePost", method = RequestMethod.POST)
    public @ResponseBody String homePost(@RequestBody String body, HttpServletResponse response)
    {
            System.out.println("Dentro del HomePost333333 el body es:: "+body);
            response.addHeader("Access-Control-Allow-Origin", "*");
            //return "[{ \"id\": 104234212 }]";
            return "[{ \"id\": 333333,\"nombre\": \"Cuchy\" },{ \"id\": 444444,\"nombre\": \"Rorro\" }]";

    }
    
    @RequestMapping(value="/homePost2", method = RequestMethod.POST)
    //public @ResponseBody List<UserTo> homePost2(@RequestBody List<UserTo> body, HttpServletResponse response)
    public @ResponseBody List<UserTo> homePost2(@RequestBody List<UserTo> body)
    {
            System.out.println("Dentro del HomePost555555555  el body es:: "+body);
            //response.addHeader("Access-Control-Allow-Origin", "*");
            
            
            UserTo newUserTo = new UserTo();
            newUserTo.setId(696969);
            newUserTo.setNombre("Back");
            
            body.add(newUserTo);

            return body;

    }

}
