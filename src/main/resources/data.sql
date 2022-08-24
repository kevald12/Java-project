--Por medio de estos insert agrego la informacion, al base de datos



INSERT INTO empresa (nombre, rubro) values
('Sonni','tecnologia');

INSERT INTO cliente (nombre, apellido, dni, direccion) values
('Andres','Perez',12345678,'Calle falsa 123'),
('Felipe','Roncallo',87654321,'Avenida aqui no es 658'),
('Alejandra','Nunez',98765432,'Manzana al reves 877'),
('Oscar','Linares',65812398,'Edificio Opera 523'),
('Maria','Fernandez',32568982,'Carrera alcazar 221');

INSERT INTO producto (nombre,descripcion,precio,cantidad) values
('Smartphone 5000', 'ultimo smartphone en el mercado',5555,10),
('Laptop 8513','Laptop ultima generacion',10500,3),
('Laptop gamer 5006','Laptop perfecta para gamers',6000,25),
('Audifonos Sonni','Audifonos con ultima tecnologia',300,50),
('Smartphone pera','smartphone exclusivo de la marca',500,10),
('Poly station','ultima consola de videojuegos',800,30),
('Parlante sonni 2v','Parlante con excelentes bajos',250,10),
('Pantalla 40 pulgadas ', 'pantalla ultra delgada perfecta para peliculas',860,15),
('Control magico','control perfecto para cualquier aparato tecnologico',50,65),
('Reproductor de musica','dispositivo perfecto para guardar tu musica',60,20);


INSERT INTO factura (numero, fecha, cliente_id, empresa_id )values
(001,'2022-05-22',1,1),
(002,'2022-05-30',3,1),
(003,'2022-10-15',5,1),
(004,'2022-04-11',2,1);

INSERT INTO detalle_factura(factura_id,precio, cantidad_de_productos, producto_id, metodo_de_pago)values
(1,5.555,1 ,1 ,'credito'),
(2,21.000 ,2 ,2 ,'debito'),
(3,18.000,3,3,'credito'),
(1,2.580,3,8,'credito'),
(3,150,3,9,'credito'),
(4,240,4,10,'debito'),
(4,500,2,7,'debito');
