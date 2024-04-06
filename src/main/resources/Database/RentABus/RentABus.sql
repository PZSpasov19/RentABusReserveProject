CREATE TABLE Admins (
     AdminId INT AUTO_INCREMENT PRIMARY KEY,
     FirstName VARCHAR(255) NOT NULL,
     LastName VARCHAR(255) NOT NULL,
     EmailAddress VARCHAR(255) NOT NULL,
     PhoneNumber VARCHAR(20),
     Password VARCHAR(255) NOT NULL
);



CREATE TABLE Users (
      UserId INT AUTO_INCREMENT PRIMARY KEY,
      Password VARCHAR(255) NOT NULL,
      FullName VARCHAR(255) NOT NULL,
      EmailAddress VARCHAR(255) NOT NULL
);

CREATE TABLE BusCompanies (
  CompanyId INT AUTO_INCREMENT PRIMARY KEY,
  CompanyName VARCHAR(255) NOT NULL,
  ContactPerson VARCHAR(255),
  ContactEmail VARCHAR(255),
  ContactPhone VARCHAR(20),
  IsAvailable BOOLEAN
);

CREATE TABLE Booking (
     BookingId INT AUTO_INCREMENT PRIMARY KEY,
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
