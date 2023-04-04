drop database if exists user;
create database user;
use user;
drop table  if exists t_user;
create table t_user (id int primary key auto_increment, userName varchar(20) not null unique, password varchar(30));
insert into t_user (id,userName,password) values (1,"Tom",123);