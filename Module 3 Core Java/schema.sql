create database studentsdb;
use studentsdb;
create table students(
id int primary key auto_increment,
name varchar(50) not null,
age int,
major varchar(50)
);
insert into students(name,age,major) values
('Alice',20,'Computer Science'),
('Bob',22,'Mathematics'),
('Charlie',21,'Physics'),
('David',23,'Chemistry');