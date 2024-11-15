INSERT INTO users(username, password,enabled) VALUES('bond','james',true);
INSERT INTO users(username, password,enabled) VALUES('poo','bear',true);

INSERT INTO authorities(username, authority) VALUES('bond','ROLE_USER');
INSERT INTO authorities(username, authority) VALUES('poo','ROLE_ADMIN');