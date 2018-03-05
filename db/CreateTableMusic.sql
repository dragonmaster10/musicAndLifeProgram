CREATE TABLE music
(
	music_id			integer	  not null	    PRIMARY KEY,
	user_playlist_id		integer	  not null			    ,
	song_name			varchar(100)     not null            ,
	song_description	     varchar(500)	not null		    ,
	artist_name		varchar(100)     not null            ,	
	year_published		integer		not null		    ,
	song_url_link		varchar(300)     not null		    ,
FOREIGN KEY(user_playlist_id) REFERENCES user_playlist(user_playlist_id)
);
