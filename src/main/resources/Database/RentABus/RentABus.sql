USE RentABusDatabase;


CREATE TABLE Admins (
    AdminId INT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
	LastName VARCHAR(255) NOT NULL,
	EmailAddress VARCHAR(255) NOT NULL,
	PhoneNumber int,
    Password VARCHAR(255) NOT NULL
);

CREATE TABLE Users (
    UserId INT PRIMARY KEY,
    Password VARCHAR(255) NOT NULL,
    FullName VARCHAR(255) NOT NULL,
    EmailAddress VARCHAR(255) NOT NULL
);

CREATE TABLE BusCompanies (
    CompanyId INT PRIMARY KEY,
    CompanyName VARCHAR(255) NOT NULL,
    ContactPerson VARCHAR(255),
    ContactEmail VARCHAR(255),
    ContactPhone VARCHAR(20),
    IsAvailable BIT(1)
);

CREATE TABLE Booking (
    BookingId INT PRIMARY KEY,
    UserId INT,
    AdminId INT,
    CompanyId INT,
    BusType VARCHAR(50),
    DepartureDate DATE,
    ReturnDate DATE,
    TotalPassengers INT,
    TotalCost DECIMAL(10, 2),
    FOREIGN KEY (UserId) REFERENCES Users(UserId),
    FOREIGN KEY (AdminId) REFERENCES Admins(AdminId),
    FOREIGN KEY (CompanyId) REFERENCES BusCompanies(CompanyId)
);

