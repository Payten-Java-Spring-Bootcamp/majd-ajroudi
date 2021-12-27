<h3>Pass by value, pass by reference kavramları nedir ? Java’ ile ilişkili olarak açıklayınız.</h3>
<p>
    Pass by value, bir parametrenin değerinin bağımsız bir değişkene atanmasını ifade eder. Pass by reference, parametrenin kendisini bir değişkene atanmasını ifade eder. Başka bir deyişle, "A" parametresi referans olarak "B" değişkenine geçirilirse, "A" ve "B" aynı Memory konuma işaret eder ve "A"yı değiştirmek "B"yi de değiştirir. Ancak, Pass by value durumunda "A" ve "B" farklı Memory konumlara işaret eder.
</p>

<h3>
    Immutability nedir, neden önemlidir ? Bir Java sınıfı nasıl immutable yapılır ?
</h3>
<p>
Immutable Class, oluşturulduktan sonra içeriğini değiştiremeyeceğimiz bir sınıftır. Immutable Class örneği, Java'daki wrapper classes (Integer, Boolean, String, Byte).

Immutability avantajları güvenlik sağlamak ve paralel ortamda senkronizasyon hatalarıyla karşılaşmamasını garanti etmek. Yani diğer thread'lerde nesnelerin içeriğinin değişmemesi.

Immutability'nin bir başka yararı da güvenlik nedenleridir. Yüksek güvenlik gerektiren uygulamalarda, herhangi bir güvenlik sorunu yaşamamak için değişmez nesnelerin kullanılması önemlidir.

Immutable Class oluşturmak için aşağıdaki kurallara uyulmalıdır:
1- Class final olarak ilan edilmelidir. Bu şekilde sınıftan hiçbir child oluşturulmamasını sağlayabiliriz.
2- Class'ın alanları final ve private olarak oluşturulmalıdır. Bu şekilde, oluşturulduktan sonra alanların değerini değişmeyeceğini emin oluyoruz ve sınıfımızdan doğrudan erişimden kaçınıyoruz.
3- Nesnenin alıcısı, gerçek nesne referansını döndürmek yerine, alanın Deep Copy döndürmelidir.
</p>

<h3>
Framework ve library arasındaki fark nedir ?
</h3>
<p>
Framework ve Library, kullanmanız için başkası tarafından zaten yazılmış kodlardır. Ancak Library, halihazırda var olan bir projede belirli görevleri gerçekleştirmek için kullanılır. Framework ise projenize başlamanız için bir plan/yapı oluşturur. Framework seçtikten sonra, aynı çerçeveyi kullanarak projenizi bitirmelisiniz. Yani bir projede birden fazla framework kullanılmaz ama bir projede birden fazla Library kullanılır. Framework tarafından sunulan projenizin akışını seçme sınırlaması, Library kullanılırken mevcut değildir, çünkü Library projenizin akışını seçmenize izin verir.
</p>


<h3>
Java’da Garbage Collector’ un görevi nedir ?
</h3>
<p>

</p>


<h3>
Memory leak nedir ? Java’da memory leak oluşması mümkün müdür ?
</h3>
<p>
Memory leak, kullanılmayan nesneler gereksiz olarak bellekte tutulduğunda meydana gelir. Java, bu durumda Garbage Collector kullanmaktadır. 

Java'da Memory leak nedenleri:
    
1- Static Fields:
Garbage Collector, uygulama çalıştığı sürece Static Field'leri bellekte tutar. Bu nedenle, özellikle Collection gibi büyük statik nesneler kullanılırken Memory leak neden olur.

2- Kapatılmamış kaynaklar:
bağlantılar gibi kaynaklar belleği kullanır ve Garbage Collector yalnızca kapatıldıklarında bunları bellekten kaldırır. Bu tür kaynaklar kullanılmadıkları anda silinmelidir.

3- uygunsuz equals() ve hashcode() kullanılması.
</p>


<h3>
Yeni Java sürümleri ne sıklıkla çıkmaktadır ?
</h3>
<p>
OpenJDK: 6 ayda bir sürüm
OracleJDK: 3 senede bir sürüm
</p>

<h3>
Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?
</h3>

<p>
    Stack memory, bir fonksiyon değişkenleri gibi geçici Local verileri depolamak için kullanılan bir bellektir. Fonksiyonların çalışması sona erdiğinde Stack memory'nin verileri silenir.

Heap space, uygulamanın çalışma süresi boyunca global objeleri depolamak için kullanılır. Heap space, verileri genç nesil (young generation) ve eski nesil (old generation) olmak üzere iki düzeyde depolar. Bu kavram, Garbage collector hangi nesnelere kullanılmadığını ve Memory'den kaldırılması gerektiğini önceliklendirmesine yardımcı olur.
</p>

<h3>
OpenJDK ve OracleJDK arasındaki farklar nelerdir ?
</h3>

<p>
    <ul>
<li>Lisanslar: OpenJDK, GNU General Public Lisansını kullanan bir açık kaynaktır, Oracle JDK ise Oracle Binary Code Lisansı altında ticari bir lisans kullanmaktadır.</li>
        
<li>Sürümler, destek ve kararlılık: OpenJDK altı ayda bir yayınlanır ve yalnızca en son yayınlanan sürüme destek sağlar. Oracle JDK, her üç yılda bir yayınlanır ve bu da OracleJDK'yı OpenJDK'dan daha kararlı hale getirir.</li>
        
<li>Özellikler: Oracle, daha fazla Garbage Collector seçeneği sunar.</li>
    </ul>
</p>

<h3>
    @FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?
</h3>
<p>
    @FunctionalInterface anotasyonu, bir Functional Interface birden fazla Abstract Method'a sahip olmamasını sağlamak için kullanılır. Birden fazla Abstract Method mevcut olması durumunda, Compiler 'Unexpected @FunctionalInterface annotation' mesajını işaretler. Bu anotasyonu kullanılması zorunlu değildir.
</p>
