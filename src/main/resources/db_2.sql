CREATE TABLE categories
(
    id serial8,
    name varchar not null,
    primary key(id)

);
CREATE TABLE products
(
    id serial8,
    name varchar not null,
    price int2 not null,
    categories_id int8 not null,
    primary key(id),
    FOREIGN KEY (categories_id) REFERENCES categories(id)
);
CREATE TABLE discount
(
    id serial8,
    name varchar not null,
    percent int2 not null,
    primary key(id)
);
CREATE TABLE category_discount
(
    category_id int8 not null,
    discount_id int8 not null,
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (discount_id) REFERENCES discount(id),
    PRIMARY KEY (category_id,discount_id)
);

CREATE TABLE product_discount
(
    product_id int8 not null,
    discount_id int8 not null,
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (discount_id) REFERENCES discount(id),
    PRIMARY KEY (product_id,discount_id)
);