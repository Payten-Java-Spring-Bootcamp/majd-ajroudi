<h4>
1. Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili
için olabilir.)
</h4>

<hr/>

<h4>
2. @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.
</h4>

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

<hr/>
<h4>
3. @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.
</h4>

<p>

Bir Spring projesinde, bir Interface birden fazla Bean tarafından uygulanıyorsa, Spring hangi Bean'i kullanması gerektiğine karar veremediği için hata veriyor. Bu sorun @Qualifier veya @Primary anotasyonları kullanılarak çözülebilir:

@Qualifier: Bu anotasyonu kullanarak Spring'e "Interface'i kaç tane Bean kullanıyor olursa olsun, adı geçen belirli Bean'i kullan" diyoruz.

@Primary: Bu anotasyonu kullanarak Spring'e "Adı varsayılan Bean olarak belirtilen Bean'i kullan, ancak @Qualifier başka bir yerde kullanılıyorsa Bean'i @Qualifier anotasyonu kullanın" diyoruz.
</p>

<hr/>
<h4>
4. Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.
</h4>

<hr/>
<h4>
5. Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?
</h4>

<p>
AOP is a paradigm that complements OOP. While OOP uses the unit of Object (Class) to organize program structure, AOP uses the unit of aspect. Aspect can be any functionality/feature in the program. Examples of aspects: Money transition management, Security, Logging. 

AOP advantages:
- Better documentation, maintainability and avoiding comments.
- Easier to add features to a program
- loose coupling
- improve code reusability.
</p>

<hr/>
<h4>
6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?
</h4>

<hr/>
<h4>
7. Swagger nedir, ne amaçla kullanılmaktadır ?
</h4>

<hr/>
<h4>
8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.
</h4>

<p>
  It is a model that was designed to breakdown the REST practices into three steps (levels).
  
  Level 1: The first level of the model deals with resources. This level includes developing multiple endpoints instead of sending all requests to one single endpoint.
  
  Level 2: In this level, we make use of the several HTTP verbs (methods). For instance, if the client is not making critical changes in the database or all they are doing is retrieving data from the server, then the client should use GET. In other cases, the client might be booking an appointment  or changing an existing appointment then the client should use POST and PUT, respectively.
  
  Level 3: When the client receives the response for a submitted request, they have to know the URI required for other requests. In the third level, the server sends the URIs the might be needed by the client to tell them what kind of services they can receive and how they can receive them.
</p>

<hr/>
<h4>
9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.
</h4>

<p>
URL ve URN, URI'nin alt kümeleridir. Ancak bir URI, bir URL veya bir URN olabilir.
URI: internette bir kaynağı veya adı tanımlamak için kullanılan bir String'dir.

URL, internette bir kaynağı bulmak için kullanılan bir String'dir. bir URL, protokol, domain, port, path, ve sorgudan oluşur

  Bir URL örneği: <i>https://www.patika.dev/bootcamp</i>

protokol: https
  
www.patika.dev: domain
  
path: /bootcamp

URN, internette bir adı tanımlamak için kullanılan bir String'dir. bir URN, urn scheme specification, namespace identifier ve namespace-specific string (NSS)'den oluşur.

Bir URL örneği: <i> urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66</i>

urn scheme specification: urn
namespace identifier: uuid
namespace-specific string (NSS): 6e8bc430-9c3a-11d9-9669-0800200c9a66
</p>

<hr/>
<h4>
10. Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?
</h4>

<p>
  Idempotency is the concept that an identical request sent multiple times will always have the same effect. This concept is used to avoid mistakes from the client-side code. The client code might be written in a way that unintentionally sends duplicate requests. This mistake should handled to avoid errors on the server. 
  
  GET: will always respond with the same result without making significant changes to the server. 
  PUT: is used to update existing entity in the server. Assuming that PUT method has been triggered N times, then the Nth request will always overwrite the N-1 request.
  DELETE: is used to remove an entity from the server. The first request will receive a response status of 200 or 204, and all the trailing requests will receive a response status 404 (Not Found) because the entity has already been deleted at the first request. Although the response is different, the requests do not change the server in a different way. 
  
  Thus, GET, PUT, and DELETE are considered Idempotent methods. 
</p>

<hr/>
<h4>
11. RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında
ne tür bilgiler yer almaktadır ?
</h4>

<p>
Request for Comment (RFC): Bir teknolojinin özelliklerini açıklamak için Internet Engineering Task Force (IETF) tarafından yayınlanan bir belge. Bir RFC onaylandığında, resmi bir standart belge haline gelir. Onaydan sonra, belge üzerinde her hangi bir değişiklik yapılmasına izin verilmez.

HTTP/1.1 spesifikasyonları, Ocak 1997'de RFC 2068 dokümanında resmi olarak yayınlandı.
</p>
