USE RentABusDatabase

CREATE TABLE Admins (
    AdminId INT PRIMARY KEY,
    FirstName VARCHAR(255) NOT NULL,
	LastName VARCHAR(255) NOT NULL,
	EmailAddress VARCHAR(255) NOT NULL,
	PhoneNumber int,
    [Password] VARCHAR(255) NOT NULL
);

CREATE TABLE Users (
    UserId INT PRIMARY KEY,
    [Password] VARCHAR(255) NOT NULL,
    FullName VARCHAR(255) NOT NULL,
    EmailAddress VARCHAR(255) NOT NULL
);

CREATE TABLE BusCompanies (
    company_id INT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    contact_person VARCHAR(255),
    contact_email VARCHAR(255),
    contact_phone VARCHAR(20)
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY,
    user_id INT,
    company_id INT,
    bus_type VARCHAR(50),
    departure_date DATE,
    return_date DATE,
    total_passengers INT,
    total_cost DECIMAL(10, 2),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (company_id) REFERENCES BusCompanies(company_id)
);

