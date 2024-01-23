CREATE DATABASE automobile;
use automobile;
CREATE TABLE vehicles(
   vehicle_ID nvarchar(10) not null,
   ownerID nvarchar(10),
   plateNumber nvarchar(10),
   phoneNumber int,
   PRIMARY KEY(vehicle_ID)
   );
   desc vehicles;
   show tables;
   show columns from vehicles;
   
   CREATE TABLE Owner(
      ownerID varchar(10),
      ownerName varchar(50),
      ownerAddress varchar(255),
      primary key(ownerID)
   );
   
   show columns from Owner;
   -- ownerID is common attribute in both the tables
   alter table vehicles ADD foreign Key(ownerID) references Owner(ownerID);

   -- 14:33:48	ALTER TABLE vehicles ADD FOREIGN KEY (ownerID) REFERENCES owner (ownerID)	Error Code: 3780. Referencing column 'ownerID' and referenced column 'ownerID' in foreign key constraint 'vehicles_ibfk_1' are incompatible.	0.000 sec

-- SHOW FULL COLUMNS FROM first_table;
-- check the description of my two tables using the MySQL command
SHOW FULL COLUMNS FROM vehicles; 
SHOW full columns from Owner;

-- then (at least in my case):

-- I immediately saw that the collation of my reference's column was different (utf8mb4_unicode_ci in first_table and utf8mb4_0900_ai_ci in second_table).
-- finally:

-- changing the collation in either of the tables was the solution.
-- ALTER TABLE first_table
-- MODIFY COLUMN column_name varchar(60)
-- COLLATE utf8mb4_0900_ai_ci;
-- OR

--    ALTER TABLE second_table
--    MODIFY COLUMN column_name varchar(60)
--    COLLATE utf8mb4_unicode_ci;

ALTER TABLE Owner
    MODIFY COLUMN ownerID varchar(10)
    COLLATE utf8mb3_general_ci;

   ALTER TABLE vehicles ADD FOREIGN KEY (ownerID) REFERENCES owner (ownerID);
   
Show columns from vehicles;

   
   
   
   