use betawebDB;
select * from instructor;
select * from curso;
insert into instructor(id_instructor, apellido_paterno, apellido_materno, ci, celular,email, nombre) 
values(1,'Castillo', 'Camacho', 872022, 76921504, 'indira@gmail.com', 'Indira');
insert into instructor(id_instructor, apellido_paterno, apellido_materno, ci, celular,email, nombre) 
values(2,'Lopez', 'Baptista', 22322, 76908504, 'juan@gmail.com', 'Juan');
insert into instructor(id_instructor, apellido_paterno, apellido_materno, ci, celular,email, nombre) 
values(3,'Reinaga', 'Meneses', 91122, 73448504, 'marcelo@gmail.com', 'Marcelo');
insert into instructor(id_instructor, apellido_paterno, apellido_materno, ci, celular,email, nombre) 
values(4,'Cartagena', 'Meneses', 41122, 6448504, 'ruben@gmail.com', 'Ruben');
insert into curso(id_curso, descripcion, nombre, ubicacion, id_instructor) values(1,
 'Crea un software profesional en desarrollo web con php, html 5,
    material design y bases de datos de cero a experto','Ingenieria de software',
'https://i.imgur.com/GYNgOfm.jpg',1);
insert into curso(id_curso, descripcion, nombre, ubicacion, id_instructor) values(2,
 'Entrenamiento especializado y practico','Informatica forence',
'https://escuelaselect.com/wp-content/uploads/informatica-forense.jpg',2);
insert into curso(id_curso, descripcion, nombre, ubicacion, id_instructor) values(3,
 '¡Hazte un experto! Aprende tecnicas avanzadas de programacion','Programacion avanzada',
'https://i.ytimg.com/vi/SzlYjn0gLxw/maxresdefault.jpg',3);
insert into curso(id_curso, descripcion, nombre, ubicacion, id_instructor) values(4,
 'Formación completa en ciencia de datos: Matemáticas, Estadística, Python, 
 Estadística Avanzada, Aprendizaje Automático','Ciencia de datos',
'https://i.imgur.com/GYNgOfm.jpg',4);
insert into curso(id_curso, descripcion, nombre, ubicacion, id_instructor) values(5,
 'Matemáticas, Estadística, Estadística Avanzada','Datawarehouse',
'https://i.imgur.com/GYNgOfm.jpg',4);
insert into usuario(id_usuario, passwd,username) values(1, '123', 'indira@gmail.com');
insert into usuario(id_usuario, passwd,username) values(2, '222', 'juan@gmail.com');
insert into usuario(id_usuario, passwd,username) values(3, 'abc', 'marcelo@gmail.com');
insert into usuario(id_usuario, passwd,username) values(4, 'ccc', 'ruben@gmail.com');

select * from instructor_usuario;
insert into instructor_usuario(id_instructor,id_usuario)values(1,1);
insert into instructor_usuario(id_instructor,id_usuario)values(2,2);
insert into instructor_usuario(id_instructor,id_usuario)values(3,3);
insert into instructor_usuario(id_instructor,id_usuario)values(4,4);
insert into curso(id_curso, descripcion, instructor_name, nombre, ubicacion) 
values(1,'Crea un software profesional','juan','Ingenieria de software', 'https://i.im.jpg');

insert into usuario(id_usuario, passwd, username, id_instructor)
 values(1,'4d186321c1a7f0f354b297e8914ab240', 'indira', 1);
insert into usuario(id_usuario, passwd, username, id_instructor)
 values(2,'202cb962ac59075b964b07152d234b70', 'juan', 2);
 insert into usuario(id_usuario, passwd, username, id_instructor)
 values(3,'a237a247a278c3472c7d7230c31ac000', 'marcelo', 3);
 insert into usuario(id_usuario, passwd, username, id_instructor)
 values(4,'aadb08a38a810bfccd3fd3b54d6592e3', 'ruben', 4);
 insert into usuarioPrueba(id_usuario,nombre,apellido,email,username,contrasenia)
 values(1, 'indira','camacho','indira@gmail.com','indira','4d186321c1a7f0f354b297e8914ab240')
