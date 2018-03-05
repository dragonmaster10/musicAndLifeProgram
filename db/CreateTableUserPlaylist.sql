CREATE TABLE user_playlist
(
	user_playlist_id		integer	  not null	    PRIMARY KEY,
	user_id	 	      integer	  not null			    ,
	theme				varchar(100)     not null            ,		playlist_description	  varchar(300)	not null		    ,
	FOREIGN KEY(user_id) REFERENCES user(user_id)
			
);
