/* 
 Her bir üründen toplamda ne kadar para kazandığımızı bulunuz.

 İpucu : Group by kullanılacak

 İpucu : Products, Orders, Order Details tabloları join edilecek.

 İpucu : Sum kullanılacak.

 Sonuç aşağıdaki formatta olmalıdır.

 Ürün Adı, Kazanılan Toplam Miktar

 Not : Kazanılan tutar toplamı Order Details tablosunda unitPrice ve
 quantity alanlarının çarpımından beslenecek.
  */


select p.productname, sum(od.quantity*p.price) as 'Total Gain' from products p
inner join orderdetails od on od.productid=p.productid
inner join orders o on o.orderid=od.orderid
group by p.productname