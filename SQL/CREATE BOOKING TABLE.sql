CREATE TABLE BOOKING(                              
BOOKINGID   INT GENERATED ALWAYS AS IDENTITY(START WITH 1000,INCREMENT BY 1),
BOOKINGTIME VARCHAR(6) NOT NULL,
BOOKINGDATE DATE NOT NULL,

CONSTRAINT BOOKINGPK PRIMARY KEY(BOOKINGID),
CONSTRAINT BookDate CHECK(BOOKINGDATE IN ('%%:%%'))
);




