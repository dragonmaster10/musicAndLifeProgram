BEGIN TRANSACTION;

insert into user (user_id, name, phone) 
values  (1, 'Patrick Jones', 0871119999);

insert into user (user_id, name, phone) 
values  (2, 'Claire Boss', 0871118888);

insert into user (user_id, name, phone) 
values  (3, 'Kyle Brown', 0871117777);

COMMIT;
