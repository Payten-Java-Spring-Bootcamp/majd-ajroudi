<h3>
1. Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili
için olabilir.)
</h3>

<h3>
2. @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.
</h3>

<p>
  @SpringBootApplication anotasyonu 3 anotasyon kapsamaktadır:
  
  <ul>
    <li>
      @Configuration: Bir sınıfın @Bean anotasyonu sahip olduğunu gösterir
    </li>
    <li>
      @EnableAutoConfiguration: auto-configuration özelliğine izin verir. Auto-configuration, bir geliştircinin ihtıyac duyacağı Bean'ler bulmaya çalışıyordur.
    </li>
    <li>
      @ComponentScan: Spring bileşenlerin taramasına izin verir. Java'da, @Component, @Configuration, @Service'a göre yazılan sınıflar, Spring tarafından otomatik olarak algılanır. @ComponentScan, taranması gereken bileşenleri belirliyor.
    </li>
</ul>
</p>

<h3>
3. @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.
</h3>

<h3>
4. Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.
</h3>

<h3>
5. Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?
</h3>

<p>
AOP is a paradigm that complements OOP. While OOP uses the unit of Object (Class) to organize program structure, AOP uses the unit of aspect. Aspect can be any functionality/feature in the program. Examples of aspects: Money transition management, Security, Logging. 

AOP advantages:
- Better documentation, maintainability and avoiding comments.
- Easier to add features to a program
- loose coupling
- improve code reusability.
</p>

<h3>
6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?
</h3>

<h3>
7. Swagger nedir, ne amaçla kullanılmaktadır ?
</h3>

<h3>
8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.
</h3>

<p>
  It is a model that was designed to breakdown the REST practices into three steps (levels).
  
  Level 1: The first level of the model deals with resources. This level includes developing multiple endpoints instead of sending all requests to one single endpoint.
  
  Level 2: In this level, we make use of the several HTTP verbs (methods). For instance, if the client is not making critical changes in the database or all they are doing is retrieving data from the server, then the client should use GET. In other cases, the client might be booking an appointment  or changing an existing appointment then the client should use POST and PUT, respectively.
  
  Level 3: When the client receives the response for a submitted request, they have to know the URI required for other requests. In the third level, the server sends the URIs the might be needed by the client to tell them what kind of services they can receive and how they can receive them.
</p>

<h3>
9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.
</h3>

<h3>
10. Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?
</h3>

<h3>
11. RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında
ne tür bilgiler yer almaktadır ?
</h3>
