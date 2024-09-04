INSERT INTO customers (first_name, last_name, email, created_at, city) VALUES
('John', 'Doe', 'john.doe@example.com', '2023-01-01 10:00:00', 'New York'),
('Jane', 'Smith', 'jane.smith@example.com', '2023-01-15 11:30:00', 'Los Angeles'),
('Bob', 'Johnson', 'bob.johnson@example.com', '2023-02-01 09:15:00', 'Chicago'),
('Alice', 'Brown', 'alice.brown@example.com', '2023-02-15 14:45:00', 'Houston'),
('Charlie', 'Davis', 'charlie.davis@example.com', '2023-03-01 16:20:00', 'Phoenix');

-- Insert sample data into Products table
INSERT INTO products (title, price) VALUES
('T-shirt', 19.99),
('Jeans', 49.99),
('Sneakers', 79.99),
('Backpack', 39.99),
('Watch', 99.99);

-- Insert sample data into Orders table
INSERT INTO orders (customer_id, total_price, months) VALUES
(1, 69.98, 'jan'),
(2, 119.98, 'feb'),
(3, 159.97, 'march'),
(4, 89.98, 'april'),
(5, 199.98,'may'),
(1, 139.97, 'june'),
(2, 179.98, 'july'),
(3, 99.99, 'august'),
(4, 129.98, 'september'),
(5, 229.97, 'october');