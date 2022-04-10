
drop table  if exists user;
create table user (id int primary key auto_increment, user_name varchar(20) not null unique, password varchar(30),real_name varchar(30) );
insert into user (id,user_name,password,real_name) values (1,"admin",123,"管理员");
insert into user (id,user_name,password,real_name) values (1,"Tom",123,"汤姆");