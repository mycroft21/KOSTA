select * from CUSTOMERS;

create table CUSTOMERS(
code number(4) primary key,
name varchar2(30) not null,
email varchar2(30),
phone varchar2(35));

insert into CUSTOMERS values(2,4,5,6);