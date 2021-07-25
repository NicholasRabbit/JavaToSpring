drop database if exists customer;
create database customer;
use customer;
drop table if exists t_user;
create table t_user (
    id int(8) primary key auto_increment ,
    name varchar(20) unique not null ,
    gender char(1),
    tel varchar(20),
    addr varchar(10)
);
insert into t_user (name,gender) values ("Tom",'f');