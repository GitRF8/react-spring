CREATE TABLE `todos` (
  `id`       INT           NOT NULL  AUTO_INCREMENT,
  `version`  INT           NOT NULL  DEFAULT 0,
  `text`    VARCHAR(255)  NOT NULL,
  `completed` BOOLEAN      NOT NULL  DEFAULT FALSE,
  `created`  TIMESTAMP     NOT NULL  DEFAULT NOW(),
  `modified` TIMESTAMP     NOT NULL  DEFAULT NOW(),
  PRIMARY KEY (`id`));