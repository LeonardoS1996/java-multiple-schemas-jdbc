create table train.ticket (
	id serial PRIMARY KEY,
	price numeric(4,2)
);

create table subway.ticket (
	id serial PRIMARY KEY,
	price numeric(4,2)
);

create sequence train.ticket_sequence start with 1;
create sequence subway.ticket_sequence start with 1;

insert into train.ticket values (
	nextVal('train.ticket_sequence'),
	4.00
);

insert into train.ticket values (
	nextVal('train.ticket_sequence'),
	5.00
);
