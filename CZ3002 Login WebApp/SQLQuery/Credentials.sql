CREATE SCHEMA LoginApp;

CREATE  TABLE LoginApp.credentials (
  id INT NOT NULL ,
  user VARCHAR(20) NOT NULL ,
  password VARCHAR(20) NOT NULL ,
  PRIMARY KEY (id) ,
  UNIQUE(user));

INSERT INTO LoginApp.credentials VALUES (0, 'user', 'pass');
INSERT INTO LoginApp.credentials VALUES (1, 'admin', 'admin');