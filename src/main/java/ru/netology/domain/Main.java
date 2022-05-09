package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Петрович";
        post.surname = "Сидоров";
        post.passport = "3333 № 444444";
        post.phone = "+7 (999) 999 99 99";
        post.subscription = "true";

        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "6";
        post.birthday.year = "1999";


    }
}






