
DROP TABLE IF EXISTS goudi;
create table user(
	id int primary key AUTO_INCREMENT not null,
	username varchar(25) not null,
	password varchar(25) not null,
	email varchar(30) not null,
	phone varchar(30)
)