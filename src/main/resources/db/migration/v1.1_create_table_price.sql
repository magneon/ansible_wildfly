CREATE TABLE price (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    value DECIMAL(6,2) NOT NULL
);

ALTER TABLE price ADD COLUMN id_product INT NOT NULL;
ALTER TABLE price ADD FOREIGN KEY (id_product) REFERENCES product(id);