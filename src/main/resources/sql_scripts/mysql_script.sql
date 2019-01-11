CREATE DATABASE documents;
USE documents;

CREATE TABLE identity_document_type (
	identity_type 	VARCHAR(5) NOT NULL,
	description VARCHAR(70) NOT NULL,
	
	CONSTRAINT pk_identiy_type PRIMARY KEY (identity_type) 
);

CREATE TABLE document_type (
	id_document	VARCHAR(3) NOT NULL,
	description VARCHAR(70) NOT NULL,
	
	CONSTRAINT pk_document_type PRIMARY KEY (id_document)
);

CREATE TABLE users (
	identity_number VARCHAR(20) NOT NULL,
	identity_type 	VARCHAR(4) NOT NULL,
	given_names 	VARCHAR(50) NOT NULL,
	surname 		VARCHAR(50) NOT NULL,
	password 		VARCHAR(20) NOT NULL,
	email 			VARCHAR(50),
	is_active 		CHAR(1) NOT NULL,
	expiration_date DATETIME,
	
	CONSTRAINT pk_users PRIMARY KEY (identity_number, identity_type),
	CONSTRAINT fk_type_1 FOREIGN KEY (identity_type) REFERENCES identity_document_type (identity_type) 
);

CREATE TABLE document (
	id_document 	VARCHAR(20) NOT NULL,
	document_type 	VARCHAR(3) NOT NULL,
	entry_date		DATETIME,
	user_id_number	VARCHAR(20) NOT NULL,
	user_id_type	VARCHAR(4) NOT NULL,
	comments		VARCHAR(255),
	
	CONSTRAINT pk_document PRIMARY KEY (id_document),
	CONSTRAINT fk_users_1  FOREIGN KEY (user_id_number, user_id_type) REFERENCES users (identity_number, identity_type)
);

INSERT INTO identity_document_type VALUES ('IC', 'Citizen card');
INSERT INTO identity_document_type VALUES ('SS', 'Social security');
INSERT INTO identity_document_type VALUES ('DL', 'Driver license');
INSERT INTO identity_document_type VALUES ('PSS', 'Passport');
COMMIT;

INSERT INTO document_type VALUES ('I', 'Internal document');
INSERT INTO document_type VALUES ('E', 'External document');
INSERT INTO document_type VALUES ('R', 'Received document');
COMMIT;
