package com.example.demo;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("your_server")
public class CountController {

    @RequestMapping("")
    public String index(HttpSession session) {
        Integer currentCount = (Integer) session.getAttribute("count");
        if (currentCount == null) {
            currentCount = 0;
        } else {
            currentCount++;
        }
        session.setAttribute("count", currentCount);
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String count(HttpSession session) {
        Integer currentCount = (Integer) session.getAttribute("count");
        if (currentCount == null) {
            session.setAttribute("count", 0);
        }
        return "counts.jsp";
    }

    @RequestMapping("increment2")
    public String increment(HttpSession session) {
        Integer currentCount = (Integer) session.getAttribute("count");
        if (currentCount == null) {
            currentCount = 0;
        } else {
            currentCount += 2;
        }
        session.setAttribute("count", currentCount);
        return "index.jsp";
    }

    @RequestMapping("back_to_zero")
    public String backToZero(HttpSession session) {
        session.setAttribute("count", 0);
        return "counts.jsp";
    }
}
