
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), review varchar(255), book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), review varchar(255), book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), comment varchar(255), rating bigint, book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), comment varchar(255), rating bigint, book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), comment varchar(255), rating bigint, book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), comment varchar(255), rating bigint, book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
create table book (id bigint generated by default as identity (start with 1), author varchar(255), title varchar(255), primary key (id));
create table review (id bigint generated by default as identity (start with 1), comment varchar(255), rating bigint, book_id bigint not null, user_id bigint not null, primary key (id));
create table user (id bigint generated by default as identity (start with 1), password varchar(255), user_name varchar(255), primary key (id));
alter table review add constraint FK70yrt09r4r54tcgkrwbeqenbs foreign key (book_id) references book;
alter table review add constraint FKiyf57dy48lyiftdrf7y87rnxi foreign key (user_id) references user;
