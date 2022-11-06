CREATE TABLE MEMBERS(
MemberID        INT GENERATED ALWAYS AS IDENTITY(START WITH 1000,INCREMENT BY 1),         --[for random generated usernames]
MemUsername	VARCHAR(20) NOT NULL,
MemPassword	VARCHAR(40) NOT NULL,
DateOfBirth	DATE NOT NULL,
AdminLevel	DEFAULT 'member',


CONSTRAINT MemberPrimKey PRIMARY KEY(MemberID),


);
