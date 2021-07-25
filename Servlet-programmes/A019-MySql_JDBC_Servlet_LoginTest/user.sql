drop database if exists user;
create database user;
use user;
drop table if exists t_user;
create table t_user(id int primary key auto_increment, userName varchar(255), password varchar(255));
insert into t_user (userName,password) values ("Tom","333");