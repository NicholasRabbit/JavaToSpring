#这里把用户名设置成user_name是为了以后测试用

drop database if exists ssm;
create database ssm;
use ssm;
create table user (id int primary key auto_increment, user_name varchar(255),gender char(8), age int);
insert into user (id, user_name,gender,age) values (1,"Jack","male",30);
