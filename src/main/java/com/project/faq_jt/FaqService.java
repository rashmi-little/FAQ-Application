package com.project.faq_jt;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import java.util.*;

@Service
@RequiredArgsConstructor
public class FaqService {
    private final FaqRepository faqRepository;
    public List<Faq> getAllQuestionsAndAnswers() {
        List<Faq> faqs = new ArrayList<>();
        faqs.add(faqRepository.getQuestions1());
        faqs.add(faqRepository.getQuestions2());
        faqs.add(faqRepository.getQuestions3());
        faqs.add(faqRepository.getQuestions4());
        faqs.add(faqRepository.getQuestions5());
        return faqs;
    }
}
