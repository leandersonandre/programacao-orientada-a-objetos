# JDBC


Tabela Pessoa

```sql
create table pessoa ( 
    id int(11) not null auto_increment, 
    nome varchar(250), 
    sobrenome varchar(250), 
    constraint pessoa_pk primary key (id)
);
```

[Driver](mysql-connector-java-8.0.17.jar) de conexão com banco de dados MySQL.

String de conexão com MySql

```
jdbc:mysql://localhost:3306/nome_banco
```

