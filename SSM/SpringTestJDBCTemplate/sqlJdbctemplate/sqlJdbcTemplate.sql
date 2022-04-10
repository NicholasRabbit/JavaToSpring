#执行相关程序前先删除相关行，否则冲突
delete from t_user where id in (6,7,8,9);