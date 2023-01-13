create database ss05;
use ss05;

create table Music(
	id int primary key auto_increment,
    nameMusic varchar(50),
    artistsShow varchar(50),
    category varchar(50),
    urlMusic varchar(250)
);