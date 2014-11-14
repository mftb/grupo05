CREATE TABLE Users
(
ID int NOT NULL AUTO_INCREMENT,
Name varchar(50),
Email varchar(50),
Password varchar(30),
PRIMARY KEY (ID)
);

CREATE TABLE TestFile
(
ID int NOT NULL AUTO_INCREMENT,
Name varchar(256),
Owner varchar(50),
AddTs timestamp,
PRIMARY KEY (ID)
);

CREATE TABLE SharedFiles
(
ID int NOT NULL,
UserID int NOT NULL,
sharedTs timestamp,
PRIMARY KEY (ID),
FOREIGN KEY (ID) REFERENCES TestFile (ID),
FOREIGN KEY (UserID) REFERENCES Users (ID)
);

CREATE TABLE TestResult
(
testFile int NOT NULL,
testSet varchar(256),
testCase varchar(256),
dataTestCount int,
mutantOperator varchar(256),
mutant varchar(256),
alive int,
PRIMARY KEY (testFile),
FOREIGN KEY (testFile) REFERENCES TestFile (ID)
);
