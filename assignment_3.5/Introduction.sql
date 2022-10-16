
--Select
--ANSII

Select * from Customers
Select ContractName,CompanyName,City from Customers
Select ContractName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City='London'

--Case insensitive

Select * from Products
Select * from Products where CategoryId=1
Select * from Products where CategoryId=1 or CategoryId=3
Select * from Products where CategoryId=1 and UnitPrice>=10
Select * from Products where CategoryId=1 and UnitPrice<>10

select * from Products order by ProductName
select * from Prodcuts order by CategoryId
select * from Products order by CategoryId,ProductName

select * from Products order by UnitPrice
select * from Products order by UnitPrice asc --ascending
select * from Products order by UnitPrice desc --descending
select * from Products where CategoryId=1 order by UnitPrice desc

select count(*) from Products
select count(*) from Prodcuts where CategoryId=2
select count(*) Adet from Prodcuts where CategoryId=2

select count(*) Adet from Products
select CategoryId from Products group by CategoryId
select CategoryId,count(*) from Products group by CategoryId
select CategoryId,count(*) from Prodcuts group by CategoryId having count(*)<10
select CategoryId,count(*) from Prodcuts where UnitPrice>20 group by CategoryId having count(*)<10

select *
from Products inner join Categories
on Products.CategoryId = Categories.CategoryId

select Produtcs.ProductId, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryId = Categories.CategoryId

select Produtcs.ProductId, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryId = Categories.CategoryId
where Products.UnitPrice>10

--DTO Data Transformation Object

select * from Products p inner join OrderDetails od
on p.ProductId = od.ProductID

select * from Products p left join OrderDetails od
on p.ProductId = od.ProductId

--Multiple

select * from Products p inner join OrderDetails od
on p.ProductId = od.ProductId
inner join Orders o
on o.OrderId = od.OrderId

--
select * from Customers c inner join Orders o
on c.CustomerId = o.CustomerId

select * from Customers c left join Orders o
on c.CustomerId = o.CustomerId

select * from Customer c left join Orders o
on c.CustomerId = o.CustomerId
where o.CustomerId is null
