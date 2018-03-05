BEGIN TRANSACTION;

insert into user_playlist (user_playlist_id, user_id, theme, playlist_description) 
values  (1, 1, 'friendship', 'it is important for kids in secondary school to learn about friendship');



insert into user (user_playlist_id, user_id, theme, playlist_description) 
values  (2, 3, 'peace', 'it is important for kids in secondary school to learn about peace');


insert into user (user_playlist_id, user_id, theme, playlist_description) 
values  (3,2 , 'happy moments', 'it is important for kids in secondary school to learn how to share and appreciate happy moments');


COMMIT;
