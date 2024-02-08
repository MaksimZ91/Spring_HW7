package com.example.Spring_HW7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    /**
     * Домашняя страница для всех пользователей.
     * @return Представление домашней страницы.
     */
    @GetMapping
    public String homePage() {
        return "home";
    }

    /**
     * Публичная страница для авторизованных пользователей.
     * @return Представление публичной страницы.
     */
    @GetMapping("/public-data")
    public String publicPage() {
        return "public";
    }

    /**
     * Приватная страница для администрации пользователей.
     * @return Представление приватной страницы.
     */
    @GetMapping("/private-data")
    public String privatePage() {
        return "private";
    }
}
