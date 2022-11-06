
);CREATE TABLE MEMBERS(
memberID        INT GENERATED ALWAYS AS IDENTITY(START WITH 2000,INCREMENT BY 1),         --[for random generated usernames]
memberUsername	VARCHAR(20) NOT NULL,
memberPasword   VARCHAR(40) NOT NULL,
memberDOB 	DATE NOT NULL,
memberENumber   VARCHAR(13) NOT NULL,

CONSTRAINT memberPrimKey PRIMARY KEY(memberID),
CONSTRAINT ENumberCheck CHECK (memberENumber IN ('07%','+44%'))


);