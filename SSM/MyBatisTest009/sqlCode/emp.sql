#这里把用户名设置成user_name是为了以后测试用
#emp是id,不是eid,注意！！
drop database if exists ssm;
create database ssm;
use ssm;
drop table if exists dept;
drop table if exists emp;
create table dept (did int primary key unique, dname varchar(100) not null);
insert into dept (did ,dname ) values (11,"sales"),(22,"hr"),(33,"research"),(44,"manage"),(55,"account");
create table emp (id int primary key auto_increment, ename varchar(255),gender char(8), age int,did int, foreign key(did) references dept(did));
insert into emp (id, ename,gender,age,did) 
values (1,"Jack","male",30,11),(2,"Mike","male",36,22),(3,"Jane","female",40,33),(4,"Landa","male",20,22),(5,"Ann","female",35,11);


select id,ename,gender,age from emp where id=1 and ename="Jack" and gender="male" and age="30";


#测试分页，多加几个数据
insert into emp (id, ename,gender,age,did) 
values (6,"aa","male",30,11),(7,"bb","male",36,22),(8,"cc","female",40,33),(9,"dd","male",20,22),(10,"ee","female",35,11);
