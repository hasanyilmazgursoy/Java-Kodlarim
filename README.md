# ☕ Java-Kodlarim

Java programlama dilini öğrenme sürecinde yazılmış alıştırma ve örnek kodlardan oluşan bir koleksiyon.  
Temel veri yapıları, metot kullanımı ve özyinelemeli algoritmalar üzerine **89 adet** pratik örnek içerir.

---

## 📂 İçerik

| Kategori | Klasör | Dosya Sayısı | Konu |
|---|---|---|---|
| Dizi Alıştırmaları | [`src/diziler/`](src/diziler/) | 28 | Dizi tanımlama, döngü, sıralama, arama, kaydırma, matris işlemleri |
| Metot Alıştırmaları | [`src/metodlar/`](src/metodlar/) | 32 | Parametre alma, geri dönüş değeri, string işleme, basamak/faktöriyel/asal |
| Özyineleme Örnekleri | [`src/rekursiyon/`](src/rekursiyon/) | 29 | Toplam, faktöriyel, fibonacci, palindrom, dizi işlemleri (recursive) |

---

## 🗂 Proje Yapısı

```
Java-Kodlarim/
├── src/
│   ├── diziler/               # Dizi alıştırma örnekleri (28 dosya)
│   │   ├── diziAlistirma (1).java
│   │   └── ...
│   ├── metodlar/              # Metot alıştırma örnekleri (32 dosya)
│   │   ├── methodAlistirma (1).java
│   │   └── ...
│   └── rekursiyon/            # Özyinelemeli algoritma örnekleri (29 dosya)
│       ├── recursiförnek (1).java
│       └── ...
├── compile_all.sh             # Tüm dosyaları derleyen Bash scripti
├── .gitignore
└── README.md
```

---

## 🚀 Çalıştırma

Her dosya bağımsız, bağımsız `public class` içeren bir Java kaynak dosyasıdır. Tek bir dosyayı derleyip çalıştırmak için:

```bash
# Örnek: dizi alıştırmasını derle ve çalıştır
cd src/diziler
javac "diziAlistirma (1).java"
java ornek18
```

> **Not:** Dosya adları boşluk içerdiğinden terminal komutlarında tırnak içine alınmalıdır.  
> Çalıştırılacak class adı dosya içindeki `public class` adıyla eşleşmelidir.

### Tümünü Derleme (Linux/macOS/Git Bash)

```bash
bash compile_all.sh
```

---

## 🛠 Gereksinimler

- **JDK 8+** — [İndir](https://adoptium.net/)
- Herhangi bir metin editörü veya IDE (VS Code, IntelliJ IDEA, Eclipse)

---

## 📖 Konu Başlıkları

### 🗃 Dizi Alıştırmaları (`src/diziler/`)
- Diziyi sağa/sola kaydırma
- Dizi elemanlarını tersine çevirme
- En büyük / en küçük eleman bulma
- Ortalamadan küçük elemanları listeleme
- Tek/çift elemanları ayırma ve toplama
- 2×2 matris toplama
- Satır ve sütun toplamları (2B dizi)
- Kabarcık sıralaması (büyükten küçüğe)
- String dizisinde arama ve birleştirme

### ⚙️ Metot Alıştırmaları (`src/metodlar/`)
- Basamak sayısı hesaplama
- Faktöriyel (iteratif)
- İki sayıdan büyüğünü döndürme
- String tersine çevirme
- Küçük/büyük harf sayma
- Kelime sayısı bulma
- Asal sayı kontrolü
- Dizi toplamı / ortalaması / sıralı olup olmadığını kontrol
- Üçgen kenar testi
- Büyük-küçük harf değiştirme

### 🔁 Özyineleme Örnekleri (`src/rekursiyon/`)
- `n`'e kadar sayıların toplamı
- Üs alma (`a^b`)
- Faktöriyel (recursive)
- Fibonacci dizisi
- Sıralı dizi kontrolü
- String tersine çevirme (recursive)
- Palindrom kontrolü
- Dizide en büyük eleman ve indisi bulma
- Boşluk silme (recursive)
- Matris toplamı (recursive)

---

## 👤 Yazar

**Hasan Yılmaz Gürsoy**  
GitHub: [@hasanyilmazgursoy](https://github.com/hasanyilmazgursoy)

---

## 📝 Lisans

Bu proje eğitim amaçlıdır. Serbestçe kullanılabilir.
