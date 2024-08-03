package com.project.faq_jt;

import org.springframework.stereotype.Repository;

@Repository
public class FaqRepository {
    public Faq getQuestions1() {
        var faq = new Faq();
        faq.setQuestion("What is Java and how does it differ from other programming languages?");
        faq.setAnswer(
                "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        return faq;
    }

    public Faq getQuestions2() {
        var faq = new Faq();
        faq.setQuestion("What is Spring Boot, and how does it simplify the development of Java applications?");
        faq.setAnswer(
                "Spring Boot is an open-source Java-based framework used to create stand-alone, production-grade Spring-based applications with minimal configuration.");
        return faq;
    }

    public Faq getQuestions3() {
        var faq = new Faq();
        faq.setQuestion("What is a REST API, and why is it commonly used in web development?");
        faq.setAnswer(
                "A REST API (Representational State Transfer Application Programming Interface) is a set of rules and conventions for building and interacting with web services.");
        return faq;
    }

    public Faq getQuestions4() {
        var faq = new Faq();
        faq.setQuestion(
                "What is Thymeleaf, and how does it integrate with the Spring framework for building web applications?");
        faq.setAnswer(
                "Thymeleaf is a modern Java template engine for server-side applications that integrates seamlessly with the Spring framework.");
        return faq;
    }

    public Faq getQuestions5() {
        var faq = new Faq();
        faq.setQuestion("What is Dependency Injection, and how does it promote loose coupling in software design?");
        faq.setAnswer(
                "Dependency Injection (DI) is a design pattern that allows for the decoupling of components in software design.");
        return faq;
    }
}
