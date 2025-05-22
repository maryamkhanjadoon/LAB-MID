CREATE DATABASE shopping_assistant;

USE shopping_assistant;

CREATE TABLE items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10,2),
    store_name VARCHAR(100)
);

INSERT INTO items (name, price, store_name) VALUES
('Milk', 2.50, 'Store A'),
('Juice', 2.30, 'Store B'),
('Rice', 1.20, 'Store A'),
('Bread', 1.15, 'Store C');


