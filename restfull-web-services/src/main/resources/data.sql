
--BIRTH_DATE ID NAME USER_DETAILS 
insert into USER_DETAILS(ID, BIRTH_DATE, NAME )
VALUES(10001, current_date(), 'Mobin Arshad'), 
(10002, current_date(), 'Washim Arshad'),
(10003, current_date(), 'Nadim Arshad')
;

insert into Post(ID, USER_ID, DESCRIPTION)
values(2001, 10001, 'Learn Microservices along with Elastic search, kafka, redish'),
(2002, 10001, 'Will learn the DSA in depth'),
(2003, 10001, 'Learn the system designing in depth'),
(2004, 10002, 'Learn the management tools and speaking');