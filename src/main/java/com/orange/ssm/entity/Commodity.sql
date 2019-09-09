-- auto Generated on 2019-09-08
-- DROP TABLE IF EXISTS commodity;
CREATE TABLE commodity(
	commodityid INT (11) NOT NULL AUTO_INCREMENT COMMENT 'commodityid',
	commodityname VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'commodityname',
	price DOUBLE (16,4) NOT NULL DEFAULT -1.0 COMMENT 'price',
	`number` INT (11) NOT NULL DEFAULT -1 COMMENT 'number',
	`describe` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'describe',
	flag INT (11) NOT NULL DEFAULT -1 COMMENT 'flag',
	PRIMARY KEY (commodityid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'commodity';
