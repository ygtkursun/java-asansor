# Rapor

**Ad Soyad:** Yiğit Kurşun
**Numara:** 95

## 1. Problemin Açıklaması
<!-- Problemi kendi cümlelerinizle yazın. -->
Asansörü taklit eden bir kodumuz var. Sistem bizden 2 girdi istiyor. Biri bulunduğumuz kat, diğeri bulunmak istediğimiz kat. Bu iki girdi 1'den 10'a kadar bir sayı olmalı. Girdileri girdiğimizde bize 4 çıktı veriyor. Bulunduğumuz kat, bulunmak istediğimiz kat, asansörün yönü (yukarı, aşağı, sabit) ve kaç kat hareket ettiğimiz veya etmediğimiz. Sistem, girdilerimizden yararlanarak asansörün yönünü ve kaç kat hareket ettiğimizi hesaplıyor.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-"Bulundugunuz kati (1-10) girin: " -> 1 (Kaydedilen değişken: number)
-"Hedef kati (1-10) girin: " -> 10 (Kaydedilen değişken: number2)

**İşlemler:**
-"number ve number2 ilişkisi nasıl?" -> (number < number2) (Buna göre) -> Asansör yönü yukarı olmalı
-"Kaç kat çıkıldı?" (number < number2) -> (number2 - number) (Buna göre) -> number2 (10) - number (1) = 9 kat çıkıldı 

**Çıktılar:**
-Mevcut kat: 1
-Hedef kat: 10
-Asansor yukari cikiyor.
-Cikacaginiz kat: 9

## 3. Sözde Kod (Pseudocode)

```
1. Sistem bizden sırasıyla bulunduğumuz katı ve hedef katı ister.
2. Değişkenlerin ilişkisine göre asansörün yönünü ve değiştirdiğimiz kat sayısını hesaplar.
3. Mevcut katı, hedef katı, asansörün yönünü ve değiştirdiğimiz kat sayısını yazar.
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | Cikacaginiz kat: 5 | Doğru |
| 9 | 2 | 7 kat aşağı | Ineceginiz kat: 7 | Doğru |
| 5 | 5 | Hareket yok | Asansor hareket etmiyor. | Doğru |
| 1 | 10 | 9 kat yukarı | Cikacaginiz kat: 9 | Doğru |
| 10 | 1 | 9 kat aşağı | Ineceginiz kat: 9 | Doğru |
| 0 | 5 | Geçersiz mevcut kat | Girdiginiz bilgilerde yanlislik var! | Doğru |
| 5 | 11 | Geçersiz hedef kat | Girdiginiz bilgilerde yanlislik var! | Doğru |
| -2 | 4 | Geçersiz mevcut kat | Girdiginiz bilgilerde yanlislik var! | Doğru |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

