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
        String greeting = "";

        if (lang.equals("English")) {
            greeting = "Hello";
        }
        else if (lang.equals("French")) {
            greeting = "Bonjour";
        }
        else if (lang.equals("Italian")) {
            greeting = "Ciao";
        }
        else if (lang.equals("Spanish")) {
            greeting = "Hola";
        }
        else if (lang.equals("Russian")) {
            greeting = "Privet";
        }

        return "<html>" + "<body>" +
                "<h1>" + greeting + ", " + name + "!</h1>";
    }


    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = 'hello'>" +

                        "<label>Language:</label>" +
                        "<select name = 'lang'>" +
                        "<option value = 'English'>English</option>" +
                        "<option value = 'French'>French</option>" +
                        "<option value = 'Spanish'>Spanish</option>" +
                        "<option value = 'Russian'>Russian</option>" +
                        "<option value = 'Italian'>Italian</option>" +
                        "</select>" + "<br>" + "<br>" +
                        "<label>Name:</label>" +
                        "<input type = 'text' name = 'name' />" + "<br>" + "<br>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
