<h4>Pass by value, pass by reference kavramları nedir ? Java’ ile ilişkili olarak açıklayınız.</h4>
<p>
    Pass by value, bir parametrenin değerinin bağımsız bir değişkene atanmasını ifade eder. Pass by reference, parametrenin kendisini bir değişkene atanmasını ifade eder. Başka bir deyişle, "A" parametresi referans olarak "B" değişkenine geçirilirse, "A" ve "B" aynı Memory konuma işaret eder ve "A"yı değiştirmek "B"yi de değiştirir. Ancak, Pass by value durumunda "A" ve "B" farklı Memory konumlara işaret eder.
</p>

<h4>
Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?
</h4>

<p>
    Stack memory, bir fonksiyon değişkenleri gibi geçici Local verileri depolamak için kullanılan bir bellektir. Fonksiyonların çalışması sona erdiğinde Stack memory'nin verileri silenir.

Heap space, uygulamanın çalışma süresi boyunca global objeleri depolamak için kullanılır. Heap space, verileri genç nesil (young generation) ve eski nesil (old generation) olmak üzere iki düzeyde depolar. Bu kavram, Garbage collector hangi nesnelere kullanılmadığını ve Memory'den kaldırılması gerektiğini önceliklendirmesine yardımcı olur.
</p>

<h4>
    @FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?
</h4>
<p>
    @FunctionalInterface anotasyonu, bir Functional Interface birden fazla Abstract Method'a sahip olmamasını sağlamak için kullanılır. Birden fazla Abstract Method mevcut olması durumunda, Compiler 'Unexpected @FunctionalInterface annotation' mesajını işaretler. Bu anotasyonu kullanılması zorunlu değildir.
</p>