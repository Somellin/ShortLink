﻿# Сокращатель ссылок на Java Spring

## Стек
* Java 17
* Oracle 19c se
* Spring boot
* Spring Data JPA
* Lombok
* Thymeleaf

## Использование :

### Стартовая страница 
![img.png](preview/img.png)
### Вставляем любую ссылку и ждем укротить
### Появляется короткая ссылка
![img.png](preview/img1.png)
### Копируем ссылку и вставляем в браузер происходит редирект
![img_2.png](preview/img_2.png)
![img.png](preview/img2.png)
![img_1.png](preview/img_1.png)
### Если ссылку ввели неверно получаем 404
![img_3.png](preview/img_3.png)

### Также реализован двухсторонний поик по короткой ссылке так, если ввели ссылку которая уже есть в базе, вернется короткая ссылка (токен) из базы.
### Так как ссылка запрашивается через get скопируя адрес строки с которой сгенерирована короткая ссылка можно передать эту страницу другому человеку у которого отобразится идентичная страница.
