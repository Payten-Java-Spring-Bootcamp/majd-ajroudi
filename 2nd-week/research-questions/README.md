<h2>
1. Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili
için olabilir.)
</h2>

<p>
  .NET
</p>

<hr/>

<h2>
2. @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.
</h2>

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
<h2>
3. @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.
</h2>

<p>

Bir Spring projesinde, bir Interface birden fazla Bean tarafından uygulanıyorsa, Spring hangi Bean'i kullanması gerektiğine karar veremediği için hata veriyor. Bu sorun @Qualifier veya @Primary anotasyonları kullanılarak çözülebilir:

@Qualifier: Bu anotasyonu kullanarak Spring'e "Interface'i kaç tane Bean kullanıyor olursa olsun, adı geçen belirli Bean'i kullan" diyoruz.

@Primary: Bu anotasyonu kullanarak Spring'e "Adı varsayılan Bean olarak belirtilen Bean'i kullan, ancak @Qualifier başka bir yerde kullanılıyorsa Bean'i @Qualifier anotasyonu kullanın" diyoruz.
</p>

<hr/>
<h2>
4. Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.
</h2>

<p>
  Bir geliştircinin koda en az şekilde müdahale etmesine sağlayan ve framework'lar tarafından kullanılan bir prensiptir. Yani,bir geliştirici yalnızca kendi istediği sonuç genel düzenden farklıysa özel bir configuration dosyalara müdahale eder. Onun dışında, diğer configuration dosyaları framework tarafından sunulmaktadır.
  
</p>

<hr/>
<h2>
5. Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?
</h2>

<p>
  AOP, OOP'yi tamamlayan bir paradigmadır. OOP, program yapısını düzenlemek için Nesne (Sınıf) birimini kullanırken, AOP, Aspect birimini kullanır. Aspect, programdaki herhangi bir işlevsellik/özellik olabilir. Aspect örnekleri: Para geçiş yönetimi, Güvenlik, Log kaydetme.

AOP avantajları:

- Daha iyi dokümantasyon, sürdürülebilirlik ve yorum satırlardan kaçınma.
- Bir programa özellik eklemeği kolaylaştırır.
- kodun yeniden kullanılabilirliğini iyileştirir.
</p>

<hr/>
<h2>
6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?
</h2>

<p>

  Single Responcibility Principle: Her sınıf yalnızca bir işlevsellikten sorumludur.

  Open-Closed Prinicple: Projenin bileşenleri diğer sınıflardan kullanılabilir olup. Sınıfı düzeltmeye izin verilmemelidir.

  Liskov Substitution Principle: Subclass objeleri, superclass objeleri yerine kullanmamız mümkün olması gerek.

  Interface Segregation Principle: Client'ın kullanmadığı metodlara bağlı kalmamalıdır.

  Dependency Inversion Principle: High-level modüller, low-level modüllerden bağımsız olmalıdır. 
  
  <bold><i>Teorik olarak, bu prensiplere uyulmalıdır çünkü kodumuzu korumaya yardımcı olurlar. Ancak pratikte yazılım prensiplerini tam olarak takip etmek her zaman zordur.</i></bold>
  
</p>

<hr/>
<h2>
7. Swagger nedir, ne amaçla kullanılmaktadır ?
</h2>

<p>
Swagger, bir projenin API'sini bir JSON veya YML dosyalarına aktarmak için kullanılan bir araçtır. Bu araç, Frontend ve Backend geliştiriciler arasındaki iletişimi ve üretkenliği artırır.
</p>

<hr/>
<h2>
8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.
</h2>

<p>
  REST uygulamalarını üç adıma (seviyeye) ayırmak için tasarlanmış bir modeldir.
  
   1. Seviye: Modelin ilk seviyesi kaynaklarla ilgilenir. Bu düzey, tüm istekleri tek bir endpoint'e göndermek yerine birden çok endpoint geliştirmeyi içerir.
  
   2. Seviye: Bu seviyede, HTTP metodlardan faydalanırız. Örneğin, Client veritabanında kritik değişiklikler yapmıyorsa veya sadece sunucudan veri alıyorsa, Client GET kullanmalıdır. Diğer durumlarda, Client sistemden bir randevu alıyor veya mevcut bir randevuyu değiştirmek istiyor olabilir, bu durumda Client POST veya PUT kullanmalıdır.
  
   3. Seviye: Müşteri, gönderilen bir istek için yanıt aldığında, diğer istekler için gereken URI'yi bilmek zorundadır. Üçüncü düzeyde, sunucu, istemcinin ne tür hizmetleri alabileceklerini ve bunları nasıl alabileceklerini anlatmak için ihtiyaç duyabileceği URI'leri gönderir.
</p>

<hr/>
<h2>
9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.
</h2>

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
<h2>
10. Idempotency nedir ? Hangi HTTP metodları idempotent’ tir ?
</h2>

<p>
    Idempotency, birden çok kez gönderilen aynı isteğin her zaman sunucuya aynı etkiye sahip olacağı kavramıdır. Bu kavram, Client tarafı kodundan kaynaklanan hataları önlemek için kullanılır. Client kodu, istemeden yinelenen istekler gönderecek şekilde yazılmış olabilir. Bu hata, sunucudaki hataları önlemek için ele alınmalıdır.

  GET: sunucuda önemli değişiklikler yapmadan her zaman aynı sonucu verir. 
  PUT: sunucudaki mevcut varlığı güncellemek için kullanılır. PUT metodu N kez tetiklendiğini varsayarsak. N'ci istek her zaman N-1 isteğinin üzerine yazacaktır. 
  DELETE: Mevut bir veri sunucudan kaldırmak için kullanılır. İlk istek, 200 veya 204 yanıt durumunu alacak ve veri zaten ilk istekte silinmiş olduğundan, diğer tüm istekler bir yanıt durumu 404 (Bulunamadı) alacaktır. Yanıt farklı olsa da istekler sunucuyu farklı bir şekilde değiştirmez.

  Bu nedenle, GET, PUT ve DELETE, Idempotent yöntemler olarak kabul edilir.
</p>

<hr/>
<h2>
11. RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında
ne tür bilgiler yer almaktadır ?
</h2>

<p>
Request for Comment (RFC): Bir teknolojinin özelliklerini açıklamak için Internet Engineering Task Force (IETF) tarafından yayınlanan bir belge. Bir RFC onaylandığında, resmi bir standart belge haline gelir. Onaydan sonra, belge üzerinde her hangi bir değişiklik yapılmasına izin verilmez.

HTTP/1.1 spesifikasyonları, Ocak 1997'de RFC 2068 dokümanında resmi olarak yayınlandı.
</p>
