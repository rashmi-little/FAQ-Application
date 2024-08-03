package com.project.faq_jt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FaqController {
    private final FaqService faqService;
    @GetMapping({ "/", "/home" })
    public String home(Model model) {
        model.addAttribute("faqs", faqService.getAllQuestionsAndAnswers());
        return "home";
    }

}
