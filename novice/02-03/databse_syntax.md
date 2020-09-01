MariaDB [(none)]> create database movie_rental
    -> ;
Query OK, 1 row affected (0.005 sec)

MariaDB [(none)]> use movie_rental;
Database changed
MariaDB [movie_rental]> create table membership(
    -> membership_id varchar(2),
    -> full_names varchar(30),
    -> physical_address,
    -> salutation_is varchar(5));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near '
salutation_is varchar(5))' at line 4
MariaDB [movie_rental]> create table membership( membership_id varchar(2) not null primary key, full_names varchar(30), physical_address varchar (30), salutation_is varchar(5));
Query OK, 0 rows affected (0.049 sec)

MariaDB [movie_rental]> create table rented( membership_id varchar(3), movies_rented varchar (30));
Query OK, 0 rows affected (0.024 sec)

MariaDB [movie_rental]> create table salutations (salutation_id varchar (3) not null primary key, salutation varchar (10));
Query OK, 0 rows affected (0.026 sec)


MariaDB [movie_rental]> 
MariaDB [movie_rental]> alter table rented add constraint fk_membership_id foreign key(membership_id) references membership(membership_id) on delete cascade on update cascade;
Query OK, 0 rows affected (0.084 sec)              
Records: 0  Duplicates: 0  Warnings: 0
MariaDB [movie_rental]> alter table membership add constraint fk_salutation_id foreign key(salutation_id) references salutations(salutation_id) on delete cascade on update cascade;
Query OK, 0 rows affected (0.087 sec)              
Records: 0  Duplicates: 0  Warnings: 0
MariaDB [movie_rental]> show tables;
+------------------------+
| Tables_in_movie_rental |
+------------------------+
| membership             |
| rented                 |
| salutations            |
+------------------------+
3 rows in set (0.015 sec)

MariaDB [movie_rental]> desc membership;
+------------------+-------------+------+-----+---------+-------+
| Field            | Type        | Null | Key | Default | Extra |
+------------------+-------------+------+-----+---------+-------+
| membership_id    | varchar(2)  | NO   | PRI | NULL    |       |
| full_names       | varchar(30) | YES  |     | NULL    |       |
| physical_address | varchar(30) | YES  |     | NULL    |       |
| salutation_id    | varchar(5)  | YES  | MUL | NULL    |       |
+------------------+-------------+------+-----+---------+-------+
4 rows in set (0.017 sec)

MariaDB [movie_rental]> desc rented
    -> ;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| membership_id | varchar(3)  | YES  | MUL | NULL    |       |
| movies_rented | varchar(30) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
2 rows in set (0.002 sec)

MariaDB [movie_rental]> desc salutations;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| salutation_id | varchar(3)  | NO   | PRI | NULL    |       |
| salutation    | varchar(10) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
2 rows in set (0.001 sec)


MariaDB [movie_rental]> insert into rented values ('1','Pirates of the Caribbean'),('1','Clash of the Titans'),('2','Forgetting Sarah Marshal'),('2','Daddys Little Girls'),('3','Clash of Titans');
Query OK, 5 rows affected (0.016 sec)
Records: 5  Duplicates: 0  Warnings: 0


