create database ApartmentsManagement;
use ApartmentsManagement;

CREATE TABLE Apartment (
	BuildingID	INTEGER NOT NULL,
	Floor	INTEGER NOT NULL,
	ID	VARCHAR(2) NOT NULL,
	OwnerName	VARCHAR ( 50 ) NOT NULL,
	SquareMeters INTEGER NOT NULL,
	OwnerPhone	VARCHAR ( 10 ) NOT NULL,
	Millimeters	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,ID)
);

CREATE TABLE ApartmentsBuilding (
	ID	INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Adress	VARCHAR(60) NOT NULL,
	City	VARCHAR(30) NOT NULL,
	PostalCode	VARCHAR(5) NOT NULL,
	Apartments	INTEGER NOT NULL,
	AdminName	VARCHAR(50) NOT NULL,
	AdminPhone	VARCHAR(10) NOT NULL,
	SquareMeters	INTEGER NOT NULL
);

CREATE TABLE Elevator (
	BuildingID	INTEGER NOT NULL,
	DateYear	INTEGER NOT NULL,
	DateMonth	VARCHAR ( 20 ) NOT NULL,
	ElevatorMaintenanceCosts	FLOAT NOT NULL,
	SparePartsCosts	FLOAT NOT NULL,
	TechnicalCosts	FLOAT NOT NULL,
	TotalCosts	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,DateYear,DateMonth)
);

CREATE TABLE Expenses (
	BuildingID	INTEGER NOT NULL,
	DateYear	INTEGER NOT NULL,
	DateMonth	VARCHAR(20) NOT NULL,
	TotalCosts	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,DateYear,DateMonth)
);

CREATE TABLE Heating (
	BuildingID	INTEGER NOT NULL,
	DateYear	INTEGER NOT NULL,
	DateMonth	VARCHAR(20) NOT NULL,
	ValueOfHeating	FLOAT NOT NULL,
	BurnerMaintenance	FLOAT NOT NULL,
	TotalCosts	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,DateYear,DateMonth)
);

CREATE TABLE SharedUtilityBills (
	BuildingID	INTEGER NOT NULL,
	DateYear	INTEGER NOT NULL,
	DateMonth	VARCHAR(20) NOT NULL,
	Electricity	FLOAT NOT NULL,
	Water	FLOAT NOT NULL,
	Cleaning	FLOAT NOT NULL,
	OtherExpenses	FLOAT NOT NULL,
	TotalCosts	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,DateYear,DateMonth)
);

CREATE TABLE Users (
	ID	INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	UserName	VARCHAR(30) NOT NULL,
	UserPassword	VARCHAR(30) NOT NULL
);

CREATE TABLE JointOwnerShip (
	BuildingID	INTEGER NOT NULL,
	DateYear	INTEGER NOT NULL,
	DateMonth	VARCHAR(20) NOT NULL,
	ESFESS	FLOAT NOT NULL,
	OtherCosts	FLOAT NOT NULL,
	TotalCosts	FLOAT NOT NULL,
	PRIMARY KEY(BuildingID,DateYear,DateMonth)
);

INSERT INTO Users(UserName,UserPassword) VALUES('gtselani','iamroot');
ALTER TABLE ApartmentsBuilding AUTO_INCREMENT=101;