-- auto Generated on 2019-09-08
-- DROP TABLE IF EXISTS collector;
CREATE TABLE collector(
	colletor_id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'colletorId',
	commodoity_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'commodoityName',
	price DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT 'price',
	`describe` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'describe',
	flag INT (11) NOT NULL DEFAULT -1 COMMENT 'flag',
	PRIMARY KEY (colletor_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'collector';
