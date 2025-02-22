-- Goal
--
-- Extract the number of products (product) and orders (purchase_order) per customer for customers who have placed at
-- least two orders.
--
-- +----------------------------+
-- | CUSTOMER                   |
-- +----------------------------+
-- | customer_id - INTEGER      |
-- | firstname - VARCHAR(50)    |
-- | lastname - VARCHAR(50)     |
-- | register_date - DATE       |
-- | birth_date - DATE          |
-- | address - VARCHAR(50)      |
-- | zipcode - CHAR(5)          |
-- | city - VARCHAR(50)         |
-- | phone_number - VARCHAR(50) |
-- +----------------------------+
--
-- +-------------------------------+
-- | PRODUCT                       |
-- +-------------------------------+
-- | product_id - INTEGER          |
-- | product_category_id - INTEGER |
-- | name - VARCHAR(50)            |
-- | description - VARCHAR(255)    |
-- | price - DECIMAL(5,2)          |
-- | available_stock - INTEGER     |
-- +-------------------------------+
--
-- +----------------------+
-- | ORDER_PRODUCT        |
-- +----------------------+
-- | order_id - INTEGER   |
-- | product_id - INTEGER |
-- +----------------------+
--
-- +-----------------------+
-- | PURCHASE_ORDER        |
-- +-----------------------+
-- | order_id - INTEGER    |
-- | customer_id - INTEGER |
-- | date - DATE           |
-- +-----------------------+

-- Requirements
-- • Expected columns: Lastname, purchase_count, product_count, in that order.

SELECT
    Customer.last_name AS lastname,
    COUNT(DISTINCT Purchase_order.order_id) AS purchase_count,
    COUNT(Order_product.product_id) AS product_count
FROM
    Customer
JOIN
    Purchase_order ON Customer.customer_id = Purchase_order.customer_id
JOIN
    Order_product ON Purchase_order.order_id = Order_product.order_id
GROUP BY
    Customer.last_name
HAVING
    COUNT(DISTINCT Purchase_order.order_id) >= 2
ORDER BY
    lastname;
