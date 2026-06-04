create table accounts(
account_id int primary key auto_increment,
account_holder varchar(50) not null,
balance decimal(10,2) not null check (balance >= 0)
);
insert into accounts(account_holder, balance) values
('Alice', 1000.00),
('Bob', 1500.50);