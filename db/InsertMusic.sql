BEGIN TRANSACTION;

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 

values  (1, 1, 'Il Mondo Prima Di Te', 'this song is in the list because it talks about friendship', 'Annalisa', 2018, '  https://www.youtube.com/watch?v=fZGGmO9dXxs&index=3&list=PLFgquLnL59anyL_D9pf-f5orGTvIFI2x '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link)
 
values (2, 1,'God plan','this song is in the list because it talks about friendship', 'Drake', 2018, 'https://www.youtube.com/watch?v=xpVfcZ0ZcFM&index=12&list=PLFgquLnL59anyL_D9pf-f5orGTvIFI2x_ '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 

values(3, 1,'La Legenda Di Cristalda E Pizzomunno', 'this song is in the list because it talks about friendship', 'Max Gazze', 2018, 'https://www.youtube.com/watch?v=g8zIu43e_74&list=PLFgquLnL59anyL_D9pf-f5orGTvIFI2x_&index=13 '
);



insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 

values(4, 3, 'War', 'it is important for kids in secondary school to learn about peace', 'Edwin Starr', 2012, 'https://www.youtube.com/watch?v=dQHUAJTZqF0&list=PLMGkS4jQSgtIMBBZw5guDhwKKdZa0MP-i '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 
values(5, 3, 'Masters of War', 'it is important for kids in secondary school to learn about peace', 'Bob Dylan', 2014, 'https://www.youtube.com/watch?v=zJEjYY4TTjM&list=PLMGkS4jQSgtIMBBZw5guDhwKKdZa0MP-i&index=3 '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 
values(6, 3, 'Peace Train', 'it is important for kids in secondary school to learn about peace', 'Cat Stevens', 2013, ' https://www.youtube.com/watch?v=2y9cbbwzKRM&index=5&list=PLMGkS4jQSgtIMBBZw5guDhwKKdZa0MP-i '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 
values (7, 2, 'When We Were Young','it is important for kids in secondary school to learn how to share and appreciate happy moments', 'Aarre', 2017, 'https://www.youtube.com/watch?v=1aginGWkXZU&index=31&list=PL88534134DDA83D46 '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 
values (8, 2, 'Still Got Time','it is important for kids in secondary school to learn how to share and appreciate happy moments', 'Zayn', 2017, ' https://www.youtube.com/watch?v=K4ZeDuKF4m8&list=PL88534134DDA83D46&index=30 '
);

insert into music ( music_id, user_playlist_id, song_name, song_description, artist_name, year_published, song_url_link) 
values (9, 2, 'Mama','it is important for kids in secondary school to learn how to share and appreciate happy moments', 'Jonas Blue', 2017, ' https://www.youtube.com/watch?v=qPTfXwPf_HM&index=14&list=PL88534134DDA83D46 '
);


COMMIT;
