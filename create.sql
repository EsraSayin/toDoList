create table task (task_id integer not null auto_increment, description varchar(255), name varchar(255), state varchar(255), task integer, primary key (task_id)) engine=MyISAM
create table task_group (task_group_id integer not null auto_increment, user integer, primary key (task_group_id)) engine=MyISAM
create table user (user_id integer not null auto_increment, primary key (user_id)) engine=MyISAM
alter table task add constraint FK978etmutvoyledt4sxny8g5nn foreign key (task) references task_group (task_group_id)
alter table task_group add constraint FKat28x4g086lxsu1yobua6d2y3 foreign key (user) references user (user_id)
