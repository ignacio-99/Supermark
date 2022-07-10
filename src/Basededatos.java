
public class Basededatos {
	/*
	create database supermark;
	use supermark;
	
	create table tipo_usuario(
	id_tipo_usuario int primary key,
	nombre_tipo varchar(10),
	rol varchar (40));
	
	create table usuario(id_usuario int primary key auto_increment ,
	nombre_usuario varchar(15),
	apellido_usuario varchar(15),
	email_usuario varchar(20),
	contrasenia_usuario varchar(8),
	id_tipo_usuario int, 
	tiene_tarjeta_usuario boolean,
	foreign key (id_tipo_usuario) 
	references tipo_usuario (id_tipo_usuario));
	
	create table ventas (
	id_venta int auto_increment key,
	id_usuario int,
    fecha date,
    detalle varchar(200),
	total double,
	foreign key (id_usuario)references usuario(id_usuario));
	
	create table categoria(
	id_categoria int primary key,
	nombre_categoria varchar(30));
	
	create table producto(
	id_producto int primary key,
	nombre_producto varchar(30),
	stock_producto int,
	precio_unit_producto double,
	id_categoria int, foreign key (id_categoria)references categoria(id_categoria));
	
	
    use supermark;
insert into tipo_usuario values(1,"cliente","usuario externo");
insert into tipo_usuario values(2,"admin","usuario interno");
/*falta numero de telefono , fecha de nacimiento*/
	/*
insert into usuario values(null,"pedro","peres","pedro@gmail.com","pedro12",1,true);
insert into usuario values(null,"pedro","salvio","pesa@gmail.com","pes",1,true);
insert into usuario values(null,"mirta","corrrea","mirta80@gmail.com","mirta",1,true);
insert into usuario values(null,"melissa","armando","meli18@gmail.com","meli",1,true);
insert into usuario values(null,"ignacio","ramires","ramires77@gmail.com","1235",2,false);
insert into usuario values(null,"edgar","romano","edgar@gmail.com","2222",1,true);
/*cargando categotias*/
	/*
insert into categoria values(1,"Lacteos");
insert into categoria values(2,"Comestibles");
insert into categoria values(3,"Limpieza");
insert into categoria values(4,"Bebidas");
insert into categoria values(5,"electrodomesticos");
insert into categoria values(6,"Dulces");

insert into producto values(1,"galletas terrabusi",30,200,2);
insert into producto values(2,"fideos molto",10,150,2);
insert into producto values(3,"jabon ala",15,170,3);
insert into producto values(4,"leche entera",25,200,1);
insert into producto values(5,"Cerveza salta",20,200,4);
insert into producto values(6,"vino toro",30,150,4);
insert into producto values(7,"gomitas gomis",25,300,6);
insert into producto values(8,"chicle halls",10,100,6);
insert into producto values(9,"cargador de celular",40,800,5);
insert into producto values(10,"pilas duracell",40,180,5);

insert into ventas values(null,1,now(),"un detalle de alguna compra...",150);
insert into ventas values(null,1,"2021-12-12","un detalle de alguna compra...",150);
select*from ventas;
	
	*/

}
