package com;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping; 
@Controller  
public class Hellocontroller {
	@RequestMapping("/")  
    public String display()  
    {  
        return "index";  
    }     

}
