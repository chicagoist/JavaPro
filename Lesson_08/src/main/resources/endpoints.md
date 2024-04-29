1. Не использовать глаголы, в том числе обозначающие CRUD-операции.
   Использовать существительные.

   Неправильно - Х
   Правильно - V

   localhost:8080/products/CreateItems - X
   localhost:8080/products?id=7 - GET - V
   localhost:8080/products - POST - V

2. Не использовать единственное число, если мы не обращаемся к ресурсу-синглтону.
   Использовать множественное число.

   localhost:8080/product?id=5 - X
   localhost:8080/products?id=5 - V
   localhost:8080/price-calculator?operation=sum - V

3. Не использовать camelCase, слитное написание слов и символ подчёркивания в именах ресурсов.
   Использовать дефис.

   localhost:8080/itemmanagement - X
   localhost:8080/item_management - X
   localhost:8080/itemManagement - X
   localhost:8080/item-management - V

4. Не использовать расширения имён файлов.
   Просто опускать их.

   localhost:8080/store/items.json - X
   localhost:8080/store/items - V

5. Стараться не передавать параметры для поиска, фильтрации, сортировки в виде подстроки запроса.
   Использовать параметры.

   Например, получаем продукты из категории с ИД 3 и не дороже 100 ед.

   localhost:8080/products/3/100 - X
   localhost:8080/products?categoryId=3&maxPrice=100 - V

6. Не использовать сокращённые и не несущие смысла имена параметров.
   Использовать осмысленные имена.

   localhost:8080/users?q=John - X
   localhost:8080/books?search=history - X
   localhost:8080/users?name=John - V
   localhost:8080/books?category=history - V

7. Не использовать разные форматы для ответа.
   Соблюдать единообразие.