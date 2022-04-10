#这里把用户名设置成user_name是为了以后测试用

drop database if exists ssm;
create database ssm;
use ssm;
drop table if exists dept;
drop table if exists emp;
create table dept (did int primary key unique, dname varchar(100) not null);
insert into dept (did ,dname ) values (11,"sales"),(22,"hr"),(33,"research"),(44,"manage"),(55,"account");
create table emp (id int primary key auto_increment, ename varchar(255),gender char(8), age int,did int, foreign key(did) references dept(did));
insert into emp (id, ename,gender,age,did) values (1,"Jack","male",30,11),(2,"Mike","male",36,22),(3,"Jane","female",40,33);
