INSERT INTO departamento (nombre, codigo, telefono) VALUES
('Informática y Comunicaciones', 'IFC', '984100101'),
('Electricidad y Electrónica', 'ELE', '984100102'),
('Fabricación Mecánica', 'FME', '984100103'),
('Instalación y Mantenimiento', 'IMA', '984100104'),
('Química', 'QUI', '984100105'),
('Administración y Gestión', 'ADG', '984100109'),
('Comercio y Marketing', 'COM', '984100110'),
('Edificación y Obra Civil', 'EOC', '984100113');

INSERT INTO docente (nombre, apellidos, email, siglas, departamento_id) VALUES
('Sergio', 'Martínez López', 'sergioml@educastur.org', 'MLSe', 1),
('Laura', 'González Pérez', 'lauragp@educastur.org', 'GPLa', 1),
('David', 'Álvarez Rubio', 'davidar@educastur.org', 'ARDa', 1),
('Diego', 'Fernández Álvarez', 'diegofa@educastur.org', 'FADi', 2),
('María', 'Suárez Prieto', 'mariasu@educastur.org', 'SPMa', 2),
('Javier', 'Campos Rubio', 'javiercr@educastur.org', 'CRJa', 3),
('Hugo', 'García Prado', 'hugogp@educastur.org', 'GPHu', 4),
('Elena', 'López Castro', 'elenalc@educastur.org', 'LCEl', 4),
('Daniel', 'Santos Vega', 'danielsv@educastur.org', 'SVDa', 5),
('Lucía', 'Ortega Rivas', 'luciaor@educastur.org', 'ORLu', 5),
('Noelia', 'Lago Souto', 'noelials@educastur.org', 'LSNo', 5),
('Beatriz', 'Sánchez Rojo', 'beatrizsr@educastur.org', 'SRBe', 6),
('Raquel', 'Vega Soto', 'raquelvs@educastur.org', 'SVRa', 7),
('Alberto', 'Lorenzo Díaz', 'albertold@educastur.org', 'LDAl', 7),
('Marta', 'Rey Castro', 'martarc@educastur.org', 'CRMa', 7);

INSERT INTO rol (nombre, orden, docente_id) VALUES
('Funcionario',5,1),
('Interino',15,2),
('Funcionario',0,3),
('Prácticas',0,4),
('Interino',5,5),
('Funcionario',1,6),
('Funcionario',6,7),
('Interino',10,8),
('Funcionario',2,9),
('Funcionario',10,10),
('Interino',5,11),
('Funcionario',8,12),
('Funcionario',3,14),
('Funcionario',12,15);