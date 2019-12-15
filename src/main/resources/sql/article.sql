create table l_article
  id int(10)  unsgin not null auto increment
  title varchar(300) not null  default '',
  content text  not null  default '',
  add_time datetime  not null default current_time ,
 update_time datetime not null default current_time on update current_time ,
cat_id int(10) unsgin not null default 0,
order_id int (10) unsgin not null default 0,
know_id int (10) unsgin not null default 0;


create table l_article (
  id int(10)  unsigned not null auto_increment,
  title varchar(300) not null  default '',
  content text  not null  ,
    add_time datetime  not null default current_timestamp ,
 update_time datetime not null default current_timestamp on update current_timestamp ,
cat_id int(10) unsigned not null default 0,
order_id int (10) unsigned not null default 0,
know_id int (10) unsigned not null default 0,
primary key (id),
key content (content(700))

);
=====
 create table l_knowledge_point (
 `id` int(10) unsigned not null auto_increment,
            `name` varchar(100) not null default '',
            order_id int(10) not null default 0,
             update_time  datetime not null default current_timestamp on update current_timestamp,
            primary key (id),
            key order_id (order_id)
        );
======
    create table l_category (
 `id` int(10) unsigned not null auto_increment,
            `name` varchar(100) not null default '',
            order_id int(10) not null default 0,
             update_time  datetime not null default current_timestamp on update current_timestamp,
            primary key (id),
            key order_id (order_id)
        );