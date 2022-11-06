CREATE TABLE STAFF(
StaffID        INT GENERATED ALWAYS AS IDENTITY(START WITH 1000,INCREMENT BY 1),         --[for random generated usernames]
StaffUsername	VARCHAR(20) NOT NULL,
StaffPassword	VARCHAR(40) NOT NULL,
StaffDOB 	DATE NOT NULL,
StaffAdminLevel	VARCHAR(10) DEFAULT 'staff',

CONSTRAINT StaffPrimKey PRIMARY KEY(StaffID),
CONSTRAINT StaffOrAdmin CHECK (StaffAdminLevel IN('admin','staff'))

);
