# Spring Data Custom Query - Modifying & Transactional
It is example for post on javappa.com page.

Post ten jest formą ćwiczenia, dlatego udostępniamy kod źródłowy w postaci pliku zip. 
Możecie go ściągnąć i własnoręcznie przetestować. 
Do pełnego zrozumienia przykładu wymagana jest wiedza ogólna dotycząca Spring Data JPA, 
a w szególności zapytań własnych (custom queries), które opisujemy w naszym kursie Spring-a 
w rozdziale <a href="https://www.javappa.com/kurs-spring/spring-data-jpa-zapytania-wlasne" target="_blank">Spring Data JPA - Zapytania wlasne (Custom Queries)</a>.

Załóżmy teraz, że w pewnej aplikacji webowej, napisanej z użyciem Spring Boot-a przechowujemy 
użytkowników uprawnionych do korzystania z tej aplikacji wraz z przypisanymi do nich elementami (itemami). 
Bazę danych inicjujemy rekordami, których nazwy zaczynają się od słowa "Item" albo od słowa "AppaItem". 
Dla tak przygotowanych danych chcemy napisać zapytanie Spring Data JPA, które usunie tylko rekordy 
o nazwie zaczynającej się od słowa "AppaItem". Dodatkowo pobierzemy i wyświetlimy wszystkie pozostałe w bazie rekordy.

...

Więcej na stronie: <a href="https://www.javappa.com/blog/backend/spring-data-custom-query-modifying-and-transactional" target="_blank">Spring Data Custom Query - Modifying & Transactional</a>
