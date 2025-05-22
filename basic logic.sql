create database student_credentials;
use student_credentials;
create table student_details(id int auto_increment primary key ,student_name varchar(50),student_age int,student_rollno int,student_email_id varchar(100),student_DOB date,student_father_name varchar(100),student_mother_name varchar(100),student_dept varchar(20));
insert into student_details(student_name,student_age,student_rollno,student_email_id,student_father_name,student_mother_name,student_DOB,student_dept)values('selvamurugan',20,38,'selvassra12345@gmail.com','kumaravel','geetha','2004-06-27','it');
insert into student_details(student_name,student_age,student_rollno,student_email_id,student_father_name,student_mother_name,student_DOB,student_dept)values('sri anuna devi',18,15,'sriarunadevi@gmail.com','kumaravel','geetha','2006-11-30','ece');
insert into student_details(student_name,student_age,student_rollno,student_email_id,student_father_name,student_mother_name,student_DOB,student_dept)values('brintha',10,12,'brintha@gamil.com','kumaravel','geetha','2012-02-14','eee');
insert into student_details(student_name,student_age,student_rollno,student_email_id,student_father_name,student_mother_name,student_DOB,student_dept)values('namithasri',11,13,'namithasara@gamil.com','kanjakarupuganesan','gangaamma','2001-05-16','it'),('sarathi',12,14,'sarathi@gmail.com','kathukarupu','kalyani','2002-06-17','it'),
('kamal',21,22,'kamalnath@gmail.com','kavin','kamala','2004-06-23','it');

select*from student_details;
SET SQL_SAFE_UPDATES = 0;
update student_details
set student_dept ='it' where student_name='brintha';
SET SQL_SAFE_UPDATES = 1;
delete from student_details
where id=8;
alter table student_details
add student_gender varchar(20);
select student_dept
from student_details
where student_age >15 and student_dept='it' and student_dob >'2000-01-01';
DESC student_details;
drop database student_credentials;
