package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

@GetMapping
@ResponseBody
public String languages() {
    return "<h1>Skills Tracker<h1>" +
            "<h2>We have a few skills we would like you to learn. Here is the list.</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
            "<ol>";
}

@GetMapping("form")
@ResponseBody
public String langForm () {
    return
            "<form method = 'post' action= 'form'>" +
                    "<label><b>Name:</b></label>" + "<br>" +
                    "<input type = 'text' name = 'name'/>" + "<br>" + "<br>" +
            "<label><b>My favorite language:</b></label>" + "<br>" +
            "<select name = 'lang1'>" +
            "<option value = 'Java'>Java</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Python'>Python</option>" +
            "</select>" + "<br>" + "<br>" +
            "<label><b>My second favorite language:</b></label>" + "<br>" +
            "<select name = 'lang2'>" +
            "<option value = 'Java'>Java</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Python'>Python</option>" +
            "</select>" + "<br>" + "<br>" +
            "<label><b>My third favorite language:</b></label>" + "<br>" +
            "<select name = 'lang3'>" +
            "<option value = 'Java'>Java</option>" +
            "<option value = 'JavaScript'>JavaScript</option>" +
            "<option value = 'Python'>Python</option>" +
            "</select>" + "<br>" + "<br>" +
                    "<input type = 'submit' value = 'Go!' />" +
                    "</form>";
}

@PostMapping("form")
@ResponseBody
    public String faveLang (@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3 ) {
    return createMessage(name, lang1, lang2, lang3);
}

public String createMessage(String name, String lang1, String lang2, String lang3) {
    String fav1 = "";
    String fav2 = "";
    String fav3 = "";

    if (lang1.equalsIgnoreCase("java")) {
        fav1 = "Java";
    }
    else if (lang1.equalsIgnoreCase("javaScript")) {
        fav1 = "JavaScript";
    }
    else if (lang1.equalsIgnoreCase("python")) {
        fav1 = "Python";
    }

    if (lang2.equalsIgnoreCase("java")) {
        fav2 = "Java";
    }
    else if (lang2.equalsIgnoreCase("javaScript")) {
        fav2 = "JavaScript";
    }
    else if (lang2.equalsIgnoreCase("python")) {
        fav2 = "Python";
    }

    if (lang3.equalsIgnoreCase("java")) {
        fav3 = "Java";
    }
    else if (lang3.equalsIgnoreCase("javaScript")) {
        fav3 = "JavaScript";
    }
    else if (lang3.equalsIgnoreCase("python")) {
        fav3 = "Python";
    }


    return
            "<h1>" + name + "</h1>" +
                    "<ol>" +
                    "<li>" + fav1 + "</li>" +
                    "<li>" + fav2 + "</li>" +
                    "<li>" + fav3 + "</li>" +
                    "</ol>";

}
}

