drop table if exists t_price;
drop table if exists t_book;
create table t_book (bid int primary key auto_increment,stock int);
insert into t_book (bid,stock) values (1,10),(2,10);
create table t_price (bid int,bname varchar(50),price int ,foreign key (bid) references t_book(bid));
insert into t_price (bid,bname,price) values (1,"C",30),(2,"C++",50);
drop table if exists t_purchaser;
create table t_purchaser (pid int primary key auto_increment,balance int);
insert into t_purchaser values (1001,60);


 update t_book set stock=10;
 update t_purchaser set balance=60;
 