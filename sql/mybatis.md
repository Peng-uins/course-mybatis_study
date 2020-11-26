select * from user_info;

create table stu_info(
   stu_id varchar(50) primary key,
   stu_name varchar(50)
);

select * from stu_info;

create table user_info2(
    u_id int primary key auto_increment,
    u_name varchar(20),
    age int,
    tel varchar(11)
);

insert into user_info2(u_name, age, tel) values
('user6',21,'1234567874'),
('user2',22,'1234478574'),
('user3',23,'1485120274'),
('user4',24,'1554567874'),
('user5',25,'1744567874');

select * from user_info2 where u_id in(1,2,3);

select * from user_info2 where u_id in(select u_id from user_info2 where u_id <= 3);

-- 班级表
create table class_info(
    c_id int primary key auto_increment,
    c_name varchar(10)
);

insert into class_info (c_name) values ('s3s160'),('s3s163');

-- 修改学费，加上一个外键字段与班级表关联
create table student_info(
    stu_id int primary key auto_increment,
    stu_name varchar(20),
    stu_age int,
    c_id int -- 外键，关联班级主键
);

insert into student_info(stu_name, stu_age, c_id) values
('stu1',19,1),
('stu2',20,1),
('stu3',21,2),
('stu4',21,2);

select * from student_info;

-- 身份证表
create table card_info(
    card_id int primary key auto_increment,
    card_num varchar(50),
    stu_id int -- 外键关联学生
);

insert into card_info(card_num, stu_id) values
('440904218874631512',10),
('440785412659874122',11),
('440904218456456455',12),
('440904218778787872',13);


select * from card_info

-- 科目表
create table subject_info(
    sub_id int primary key auto_increment,
    sub_name varchar(50)
);

insert into subject_info(sub_name) values
('JAVA'),
('python'),
('PHP');

select * from subject_info;

-- 中间表，关联学生和科目
create table stu_sub(
    stu_id int ,
    sub_id int
);

insert into stu_sub(stu_id, sub_id) values
(10,1),(10,2),(11,2),(11,3),(12,1),(12,3),(13,1),(13,2);

select * from stu_sub;

select s.stu_name,s.stu_age,card.card_num,c.c_name,sub.sub_name
from student_info s join card_info card on s.stu_id = card.stu_id
left join  class_info c on c.c_id = s.c_id join stu_sub ss on
s.stu_id = ss.stu_id join subject_info sub on sub.sub_id = ss.sub_id
where c.c_name = 's3s160';

select count(*)
from student_info s join stu_sub ss on s.stu_id = ss.stu_id
join subject_info sub on sub.sub_id = ss.sub_id
where sub.sub_name = 'python';

select c.c_name,count(si.sub_name) as python from student_info s
left join class_info c on s.c_id = c.c_id join stu_sub ss on
s.stu_id = ss.stu_id join subject_info si on ss.sub_id = si.sub_id
where si.sub_name = 'python' and c.c_name = 's3s160'
group by c.c_name;


select s.stu_name,s.stu_age,c.c_id,c.c_name from class_info c join student_info s on c.c_id=s.c_id where c.c_id = 2

select stu.stu_id,stu.stu_name,stu.stu_age,card.card_num,cla.c_name
from student_info stu join card_info card on stu.stu_id = card.stu_id
join class_info cla on cla.c_id = stu.c_id


select * from student_info;
select * from stu_sub;
select * from card_info;
delete from student_info where stu_id = 6;
delete from stu_sub where stu_id = 4;
delete from card_info where stu_id =4;



select sub.sub_name from student_info s join card_info card on s.stu_id = card.stu_id
left join  class_info c on c.c_id = s.c_id join stu_sub ss on
s.stu_id = ss.stu_id join subject_info sub on sub.sub_id = ss.sub_id
where s.stu_id = 2

select si.sub_name from student_info s join stu_sub ss on s.stu_id = ss.stu_id
join subject_info si on ss.sub_id = si.sub_id
where s.stu_id = 3

