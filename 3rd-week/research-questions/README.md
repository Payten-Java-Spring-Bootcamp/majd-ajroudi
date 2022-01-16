<h3>
Imperative Programming ve Declarative Programming kavramlarını kısaca açıklayıp farklarını belirtiniz.
</h3>

<p>
Imperative Programming, geliştiricinin ne elde etmek istediğini, nasıl elde edileceğine ilişkin kontrol akışının bir açıklamasıyla ifade eden bir programlama paradigmasıdır.

Declarative Programming, neyi elde etmek istediğimizi ancak nasıl elde edeceğimizi ifade etmeyen bir paradigmadır.
</p>

<hr />

<h3>
Veri tabanlarının sorgu optimizasyonlarında index oluşturmanın avantajı nedir? Sık index kullanmak bir probleme yol açar mı?
</h3>

<p>
  Database indexing, bir veritabanın performansı artırmak için kullanılan bir tekniktir. Vertitabanındaki iki sütuna dayanır, Search Key ve Data Reference. Vertitabanı indekslemenin amacı, her bir grubuna bir indekx atmaktır.
  
  Search key, veritabanındak, Primary Key ile aynıdır (Verştabanının sırlanmaması durumunda bir avantajdır). Data Reference, Search key bulunduğu bloğa ait pointer saklar.
  
  Veritabanı indeksleme, bellek erişimi azaltılır ve dolaysıyla veritabanının performansını gelişttirir. Büyük sayıda olduğu veritabanıda bir query işletmek için veritabanın performansını yükseltilir. 
</p>

<hr />

<h3>
İlişkisel veritabanları için normalizasyon kavramı neyi ifade etmektedir? İlk 3 normal formu örnek üzerinden açıklayınız.
</h3>

<p>
  Veritabanı normalizasyon, veri fazlalığını önlemek için kullanılan bir tekniktir. Normalizasyon, büyük tabloları daha küçük tablolara böler ve ilişkileri kullanarak bunları birbirine bağlar.

İlk normal form: 
  - bir tablodaki her sütun yalnızca tek değerler içermelidir (Set'lere izin verilmez)
  - Her satır benzersiz olmalıdır. 
  - Aynı sütundaki tüm girişler aynı türde olmalıdır

İkinci normal form: 
  - ilk normal formu sağlamalıdır. 
  - Partial Dependency içermemelidir.

Üçüncü normal form: 
  - İkinci normal formu sağlamalıdır. 
  - Transitive Dependency içermemelidir.
</p>

<hr />

<h3>
ORM kütüphaneleri kullanmak her zaman avantajlı mıdır? ORM kütüphanelerinin ne gibi dezavantajları olabilir?
</h3>

<p></p>

<hr />

<h3>
Domain Specific Language (DSL) kavramını açıklayınız.
</h3>

<p>
  Domain-specific language (DSL), belirlii bir uygulama (etki alanı) için tasarlanan bir dildir. DSL'in bir örneği HTML ve CSS'dir.
  
  DSL, belirli bir uygulamada bir tür problemi çözmek için oluşturulur. Her ne kadar diğer alanlardan sorunları cözebilse de, bunu yapması amaçlanmamıştır.
  
  DSL'ler dil türü ile alt kategorize edilebilir: Domain-specific markup language (İşaretleme Dili), Domain-specific modeling language (Modelleme dili), Domain-specific programming language (Progamlama Dili)
</p>

<hr />

<h3>
Long lived transaction kavramı hangi tip transactionları ifade etmektedir? Dezanatajları var mıdır? varsa nelerdir?
</h3>

<p></p>

<hr />

<h3>
Thread Pool nedir? Nerelerde kullanılır?
</h3>

<p>
  Thread Pool, bir programın yürütülmesi sırasında eşzamanlılık sağlamak için kullanılan bir yazılım tasarım modelidir. Thread pool, birden çok iş parçacığını korur ve görevlerin aynı anda yürütülmesi için her iş parçacığına görevler atar. Bir bilgisayar programının bu şekilde uygulanması, küçük görevler için iş parçacıkları oluşturup bunları imha ederek performansı artırır. Sonuç olarak bu, programın execution time'ı azaltır.
</p>

<hr />

<h3>
Scalability nedir? Horizontal ve Vertical Scalability kavramlarını açıklayınız.
</h3>

<p>
Scalability, bir sistemin performansını artırma yeteneğini ifade eden bir özelliğidir. Artan kullanıcı sayısı, veritabanı sorguları vb. ile performansı etkilenmeyen scalable bir sistem olarak kabul edilir.

Bir sistem artık kullanıcı sayısını destekleyemediğinde, sistem kapasitesi artırılmalıdır. Horizontal ve vertical scaling, bir sistemin kapasitesini artırmanın iki farklı yoludur.

Horizontal scaling, mevcut sisteme ekstra kaynaklar (makineler) ekleyerek (scaling out) sistemin kapasitesini arttırmayı ifade eder. Vertical scaling, mevcut makineye (yani CPU, RAM) daha fazla güç ekleyerek kapasitenin artırılması anlamına gelir. Vertical scaling, "scaling up" olarak da adlandırılır.
</p>

<hr />

<h3>
Data replication ve sharding nedir? Aralarında nasılı bir fark bulunmaktadır?
</h3>

<p>
  Data replication, yüksek kullanılabilirlik, yedekleme ve olağanüstü durum kurtarma elde etmek için verilerin sürekli olarak başka bir sunucuya/Cloud'a kopyalandığı süreçtir.

  Data sharding, bir veri kümesini birden çok veritabanına ayırma ve ardından birden çok makineye dağıtma işlemidir. Bu işlem, web sitesinde veya uygulamada yüksek trafiği işlemek için yapılır.
</p>


