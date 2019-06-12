drop database if exists second_hand;
create database second_hand;
use second_hand;

CREATE TABLE users (
                       `username` VARCHAR(50) NOT NULL,
                       `password` VARCHAR(50) NOT NULL,
                       `email` VARCHAR(50) NOT NULL,
                       `phone_number` VARCHAR(50) NOT NULL,
                       PRIMARY KEY (`username`)
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

/* status为0表示商品被删除 */
CREATE TABLE goods (
                       `goods_id` INT UNSIGNED AUTO_INCREMENT,
                       `cover` LONGBLOB,
                       `title` VARCHAR(50) NOT NULL,
                       `detail` VARCHAR(1024) NOT NULL,
                       `username` VARCHAR(50) NOT NULL,
                       `contact` VARCHAR(1024) NOT NULL,
                       `status` smallint NOT NULL,
                       PRIMARY KEY (`goods_id`),
                       FOREIGN KEY (`username`)
                           REFERENCES users (`username`)
                           ON DELETE CASCADE ON UPDATE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE comments (
                          `comment_id` INT UNSIGNED AUTO_INCREMENT,
                          `username` VARCHAR(50) NOT NULL,
                          `seller` VARCHAR(50) NOT NULL,
                          `comment` VARCHAR(2048) NOT NULL,
                          PRIMARY KEY (`comment_id`),
                          FOREIGN KEY (`username`)
                              REFERENCES users (`username`)
                              ON DELETE CASCADE ON UPDATE CASCADE,
                          FOREIGN KEY (`seller`)
                              REFERENCES users (`username`)
                              ON DELETE CASCADE ON UPDATE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE follow (
                        `username` VARCHAR(50) NOT NULL,
                        `seller` VARCHAR(50) NOT NULL,
                        FOREIGN KEY (`username`)
                            REFERENCES users (`username`)
                            ON DELETE CASCADE ON UPDATE CASCADE,
                        FOREIGN KEY (`seller`)
                            REFERENCES users (`username`)
                            ON DELETE CASCADE ON UPDATE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

CREATE TABLE collect (
                         `username` VARCHAR(50) NOT NULL,
                         `goods_id` INT UNSIGNED NOT NULL,
                         FOREIGN KEY (`username`)
                             REFERENCES users (`username`)
                             ON DELETE CASCADE ON UPDATE CASCADE,
                         FOREIGN KEY (`goods_id`)
                             REFERENCES goods (`goods_id`)
                             ON DELETE CASCADE ON UPDATE CASCADE
)  ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
