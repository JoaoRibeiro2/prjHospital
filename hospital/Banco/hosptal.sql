create database hospital;
use hospital;

create table Hospital(
id_hospital INT PRIMARY KEY auto_increment,
nm_hospital varchar(45),
ds_endereco varchar(100)
);

create table Pacientes(
id_pacientes INT PRIMARY KEY auto_increment,
nm_paciente varchar(50),
nr_cpf varchar(14),
nr_rg varchar(20),
nr_idade INT,
ds_senha varchar(45),
cd_hospital int,
foreign key (cd_hospital) references Hospital(id_hospital)
);



create table Funcionarios(
id_funcionarios INT PRIMARY KEY auto_increment,
nm_funcionario varchar(45),
nr_cpf varchar(14),
nr_rg varchar(20),
nr_idade INT,
ds_senha varchar(45),
vl_hora DECIMAL(5,2),
cd_funcionario int,
foreign key (cd_funcionario) references Hospital(id_hospital)
);

create table Enfermeiros(
id_enfermeiro INT PRIMARY KEY auto_increment,
nr_coren varchar(45),
cd_funcionario int,
foreign key (cd_funcionario) references Funcionarios(id_funcionarios)
);

create table Medico(
id_medico INT PRIMARY KEY auto_increment,
nr_crm Varchar(45),
ds_especialidade Varchar(45),
cd_funcionario int,
foreign key (cd_funcionario) references Funcionarios(id_funcionarios)
); 

create table ProntoSocorro(
id_ProntoSocorro INT PRIMARY KEY auto_increment,
ds_endereco varchar(100),
cd_hospital int,
foreign key (cd_hospital) references Hospital(id_hospital)
);

select * from Hospital;