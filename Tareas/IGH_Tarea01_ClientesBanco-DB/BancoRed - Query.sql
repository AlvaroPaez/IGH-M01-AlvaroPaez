CREATE DATABASE BancoRed;

USE BancoRed;

CREATE TABLE Clientes (
  cli_id INT PRIMARY KEY,
  cli_nombre VARCHAR(50),
  cli_direccion VARCHAR(100),
  cli_telefono VARCHAR(15) NULL
);

INSERT INTO Clientes (cli_id, cli_nombre, cli_direccion, cli_telefono) VALUES
(1, 'Juan P�rez', 'Calle Principal 123', '1234567890'),
(2, 'Mar�a L�pez', 'Avenida Central 456', NULL),
(3, 'Carlos Ram�rez', 'Plaza Mayor 789', '9876543210'),
(4, 'Ana Mart�nez', 'Calle Secundaria 234', NULL),
(5, 'Pedro Garc�a', 'Paseo del Sol 567', '5555555555');