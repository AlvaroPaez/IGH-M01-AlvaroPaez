CREATE DATABASE BancoRed;

USE BancoRed;

CREATE TABLE Clientes (
  cli_id INT PRIMARY KEY,
  cli_nombre VARCHAR(50),
  cli_direccion VARCHAR(100),
  cli_telefono VARCHAR(15) NULL
);

INSERT INTO Clientes (cli_id, cli_nombre, cli_direccion, cli_telefono) VALUES
(1, 'Juan Pérez', 'Calle Principal 123', '1234567890'),
(2, 'María López', 'Avenida Central 456', NULL),
(3, 'Carlos Ramírez', 'Plaza Mayor 789', '9876543210'),
(4, 'Ana Martínez', 'Calle Secundaria 234', NULL),
(5, 'Pedro García', 'Paseo del Sol 567', '5555555555');