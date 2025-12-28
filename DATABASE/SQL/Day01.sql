show databases;
create database languages;
use languages;
----------
create table programming(
p_id int not null auto_increment, 
p_name nvarchar(100) ,
 year_of_invention date,
 primary key (p_id)
 );

desc programming;
insert into programming(p_name, year_of_invention) values('Java', '1995-01-01');
insert into programming(p_name, year_of_invention) values('JavaScript', '1995-01-01');
select * from programming;

create table programming_owner(
id int not null auto_increment, 
name nvarchar(100),
primary key(id),
p_id int, 
FOREIGN KEY (p_id) references programming(p_id)
);

insert into programming_owner(name, p_id)values('James Goslin', 1);
select * from programming_owner;


