CREATE TABLE order
(
    `order_number_seq`  INT            NOT NULL        AUTO_INCREMENT,
    `order_date`        VARCHAR(45)    NULL,
    `payment_date`      VARCHAR(45)    NULL,
    `moving_type`       VARCHAR(45)    NULL,
    `moving_price`      VARCHAR(45)    NULL,
    `payment_status`    VARCHAR(45)    NULL,
    `payment_method`    VARCHAR(45)    NULL,
    `custom_id`         VARCHAR(45)    NULL,
    `company_id`        VARCHAR(45)    NULL,
    PRIMARY KEY (order_number_seq)
);
CREATE TABLE customer
(
    `custom_id`     INT            NOT NULL    AUTO_INCREMENT,
    `password`      VARCHAR(45)    NULL,
    `address`       VARCHAR(45)    NULL,
    `phone_number`  VARCHAR(45)    NULL,
    `name`          VARCHAR(45)    NULL,
    `moving_to`     VARCHAR(45)    NULL,
    PRIMARY KEY (custom_id)
);
CREATE TABLE movin
(
    `moving_type`     VARCHAR(45)    NOT NULL,
    `moving_date`     VARCHAR(45)    NULL,
    `sqft`            VARCHAR(45)    NULL,
    `moving_to`       VARCHAR(45)    NULL,
    `moving_from`     VARCHAR(45)    NULL,
    `carrying_stuff`  VARCHAR(45)    NULL,
    `custom_id`       VARCHAR(45)    NULL,
    PRIMARY KEY (moving_type)
);
CREATE TABLE payment
(
    `payment_number_seq`  INT            NOT NULL    AUTO_INCREMENT,
    `amount_paid`         VARCHAR(45)    NULL,
    `order_date`          VARCHAR(45)    NULL,
    `company_id`          VARCHAR(45)    NULL,
    `admin_id`            VARCHAR(45)    NULL,
    `custom_id`           VARCHAR(45)    NULL,
    PRIMARY KEY (payment_number_seq)
);
CREATE TABLE category
(
    `key_seq`     INT            NOT NULL    AUTO_INCREMENT,
    `review`      VARCHAR(45)    NULL,
    `used`        VARCHAR(45)    NULL,
    `FAQ`         VARCHAR(45)    NULL,
    `event`       VARCHAR(45)    NULL,
    `number`      VARCHAR(45)    NULL,
    `title`       VARCHAR(45)    NULL,
    `writer`      VARCHAR(45)    NULL,
    `contents`    VARCHAR(45)    NULL,
    `contact`     VARCHAR(45)    NULL,
    `rating`      VARCHAR(45)    NULL,
    `company_id`  VARCHAR(45)    NULL,
    `custom_id`   VARCHAR(45)    NULL,
    PRIMARY KEY (key_seq)
);
CREATE TABLE admin
(
    `id`               VARCHAR(45)    NOT NULL,
    `payment_info`     VARCHAR(45)    NULL,
    `statistics_info`  VARCHAR(45)    NULL,
    PRIMARY KEY (id)
);
CREATE TABLE statistic
(
    `key_seq`     INT            NOT NULL    AUTO_INCREMENT,
    `profit`      VARCHAR(45)    NULL,
    `company_id`  VARCHAR(45)    NULL,
    `id`          VARCHAR(45)    NULL,
    PRIMARY KEY (key_seq)
);
CREATE TABLE company
(
    `company_id`    INT            NOT NULL    AUTO_INCREMENT,
    `password`      VARCHAR(45)    NULL,
    `address`       VARCHAR(45)    NULL,
    `email`         VARCHAR(45)    NULL,
    `phone_number`  VARCHAR(45)    NULL,
    `vehicle`       VARCHAR(45)    NULL,
    `company_name`  VARCHAR(45)    NULL,
    `preference`    VARCHAR(45)    NULL,
    `tin`           VARCHAR(45)    NULL,
    PRIMARY KEY (company_id)
);
CREATE TABLE image
(
    `key_seq`        INT            NOT NULL    AUTO_INCREMENT,
    `customer_room`  VARCHAR(45)    NULL,
    `event_img`      VARCHAR(45)    NULL,
    `profile`        VARCHAR(45)    NULL,
    `review_img`     VARCHAR(45)    NULL,
    `userd_img`      VARCHAR(45)    NULL,
    `company_img`    VARCHAR(45)    NULL,
    `contact_img`    VARCHAR(45)    NULL
);
CREATE TABLE comment
(
    `key_seq`    INT            NOT NULL    AUTO_INCREMENT,
    `contents`   VARCHAR(45)    NULL,
    `timestamp`  VARCHAR(45)    NULL,
    PRIMARY KEY (key_seq)
);

