drop table if exists student;
create table student(id long,fname varchar(50),lname varchar(60));

insert into student values(1,'kavya','reddy');
insert into student values(2,'navya','sri');
insert into student values(3,'rahul','varma');

commit;