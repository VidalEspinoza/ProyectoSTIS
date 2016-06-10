create database ProyectoStis;
use ProyectoStis;

create table Arbitro(
IdArbitro int primary key,
PagoArbi int not null,
NomArbi varchar(50) not null,
EdadArbi int not null,
ApelliArbi varchar(50) not null,
CodTeleArbi integer not null,
constraint fk_Arbi_TelArbi  foreign key(CodTeleArbi)references TeleArbitro(CodTeleArbi)
);

create table TeleArbitro(
CodTeleArbi int primary Key,
CumTel int not null
);

create table Partido(
NumPartido int primary key,
InicioParti varchar(60) not null,
FechaParti varchar(10) not null,
HoraParti varchar(20) not null,
IdArbitro int not null,
constraint fk_parti_Arbi foreign key(IdArbitro)references Arbitro(IdArbitro)
);


create table Torneo(
NumTorneo int primary key,
FechaInicioTor varchar(20) not null,
FechaFinTor varchar(20) not null,
DuraTor varchar(50)  not null
);

create table Liga(
IdLiga int primary key,
NomLiga varchar(50) not null,
NumTorneo int not null,
constraint fk_Liga_Torn foreign key(NumTorneo)references Torneo(NumTorneo)
);

create table Equipo(
IdEquipo int primary key,
NacioEquipo varchar(50) not null,
Fundaequipo varchar(50) not null,
EconoEquipo varchar(50) not null,
IdDirecTec int not null,
IdEntre int not null,
NumTorneo int not null,
constraint fk_Equip_Torn foreign key(NumTorneo)references Torneo(NumTorneo),
constraint fk_Equip_DirecTec foreign key(IdDirecTec)references DirectorTecnico(IdDirecTec),
constraint fk_Equip_Entren foreign key(IdEntre)references Entrenador(IdEntre)
);

create table TelDirecTecnico(
CodTelDirecTec int primary key,
NumDirecTecnico int not null
);

create table DetallePartido(
IdDetaPartido int primary key,
IdEquipo int not null,
NumPartido int not null,
constraint fk_DetallePart_Equip foreign key(IdEquipo)references Equipo(IdEquipo),
constraint fk_DetallePart_Part foreign key(NumPartido)references Partido(NumPartido)
);

create table DirectorTecnico(
IdDirecTec int primary key,
EdadDirecTec int not null,
NomDirecTec varchar(50) not null,
ApeDirecTec varchar(50) not null,
PagDirec int not null,
DuiDirecTec varchar(50) not null,
DireccionDirecTec varchar(50) not null,
CodTelDirecTec int not null,
constraint fk_DirecTec_TelDirecTec foreign key(CodTelDirecTec)references TelDirecTecnico(CodTelDirecTec)
);

create table PosicionJuga(
NumPosicion int primary key,
NumGolesJuga varchar(50) not null,
IdPosicion int not null,
constraint fk_PosicionJuga_Posi foreign key(IdPosicion)references Posicion(IdPosicion),
constraint fk_PosicionJuga_Jugador foreign key(NumGolesJuga)references Jugador(NumGolesJuga)

);

create table Posicion(
IdPosicion int primary key,
NumPosicion int not null,
constraint fk_Posicion_PosiJuga foreign key(NumPosicion)references PosicionJuga(NumPosicion)
);

create table DetaPosicion(
IdDetaPosicion int primary Key,
NumGolesJuga varchar(50) not null,
IdPosicion int not null,
constraint fk_DetaPosicion_Jugador foreign key(NumGolesJuga)references Jugador(NumGolesJuga),
constraint fk_DetaPosicion_Posicion foreign key(IdPosicion)references Posicion(IdPosicion)
);

create table TelJuga(
CodTelJuga int primary key,
NumTelJuga int not null
);

create table Jugador(
NumGolesJuga int primary key,
NomJuga varchar(50) not null,
ApellidoJuga varchar(50) not null,
NacioJuga varchar(50) not null,
EdadJuga int not null,
DireccionJuga varchar(50) not null,
pagoJuga int not null,
IdEquipo int not null,
IdContra int not null,
CodTelJuga int not null,
constraint fk_Jugador_Equipo foreign key(IdEquipo)references Equipo(IdEquipo),
constraint fk_Jugador_Contrato foreign key(IdContra)references Contrato(IdContra),
constraint fk_Jugador_TelJuga foreign key(CodTelJuga)references TelJuga(CodTelJuga)
);

create table Contrato(
IdContra int primary key,
FechaIniContra varchar(50) not null,
FechaFinContra varchar(50) not null,
DuraContra varchar(50) not null,
IdEntre int not null,
NumGolesJuga int not null,
constraint fk_Contrato_Entrenador foreign key(IdEntre)references Entrenador(IdEntre),
constraint fk_Contrato_Jugador foreign key(NumGolesJuga)references Jugador(NumGolesJuga)
);

create table TelEntrenador(
codTelEntre int primary key,
NumTelEntrenador varchar(20) not null
);

create table Entrenador(
IdEntre int primary key,
NombEntre varchar(50) not null, 
ApelliEntre varchar(50) not null,
DireccionEntre varchar(50) not null,
DuiEntre int not null,
NacioEntre varchar(50) not null,
PagoEntre int not null, 
codTelEntre int not null,
constraint fk_Entrenador_TelEntrenador foreign key(codTelEntre)references TelEntrenador(codTelEntre)
);
