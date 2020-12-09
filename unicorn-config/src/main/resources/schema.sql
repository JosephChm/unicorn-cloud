create table if not exists ingredient (
  id varchar(4) not null,
  name varchar(25) not null,
  type varchar(10) not null
);

create table if not exists taco (
  id varchar(4) not null,
  name varchar(50) not null,
  created_at timestamp not null
);

create table if not exists taco_ingredients (
  taco_id bigint not null,
  ingredients_id varchar(4) not null
);

create table if not exists taco_order (
  id varchar(4) not null,
  delivery_name varchar(50) not null,
  delivery_street varchar(50) not null,
  delivery_city varchar(50) not null,
  delivery_state varchar(5) not null,
  delivery_zip varchar(10) not null,
  cc_number varchar(16) not null,
  cc_expiration varchar(5) not null,
  cc_cvv varchar(3) not null,
  placed_at timestamp not null
);

create table if not exists taco_order_tacos (
  order_id bigint not null,
  tacos_id bigint not null
);