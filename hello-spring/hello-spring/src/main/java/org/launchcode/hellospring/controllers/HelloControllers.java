package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloControllers {

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String lang) {
        return createMessage(name, lang);
    }

    public static String createMessage (String name, String lang) {
        if (lang.equals("English")) {
            return "Hello " + name;
        } else if (lang.equals("French")) {
            return "Bonjour " + name;
        } else if (lang.equals("Spanish")) {
            return "Hola " + name;
        } else if (lang.equals("Russian")) {
            return "Privet " + name;
        } else if (lang.equals("Italian")) {
            return "Ciao " + name;
        } else {
            return "Invalid language";
        }
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'hello'>" +
                        "<select name = 'lang'>" +
                        "<option value = 'English'>English</option>" +
                        "<option value = 'French'>French</option>" +
                        "<option value = 'Spanish'>Spanish</option>" +
                        "<option value = 'Russian'>Russian</option>" +
                        "<option value = 'Italian'>Italian</option>" +
                        "</select>" +
                        "<input type = 'text' name = 'name' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
