-- Inserting static data

-- Payment Type data
insert into PAYMENT_TYPE (PAYMENT_TYPE_ID, PAYMENT_TYPE_NAME, PAYMENT_TYPE_DESCRIPTION)
    values (1,'Check','The use of checks to persons for purchases');
insert into PAYMENT_TYPE (PAYMENT_TYPE_ID, PAYMENT_TYPE_NAME, PAYMENT_TYPE_DESCRIPTION)
    values (2,'Online','Online Payments by the Treasurer');

-- Customers Table
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (1,'Trixie Tools','Bedecs','Anna','trixie@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','123 1st Street','Seattle','WA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (2,'Pops Pipes','Gratacos Solsona','Antonio','pops@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','123 2nd Street','Boston','MA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (3,'Racer X Metals','Axen','Thomas','racerx@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','123 3rd Street','Los Angelas','CA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (4,'Mach 5 Motors','Lee','Christina','machfive@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 4th Street','New York','NY','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (5,'Chim Chim Bolts','O’Donnell','Martin','chimchim@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','123 5th Street','Minneapolis','MN','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (6,'Moms Racer','Pérez-Olaeta','Francisco','momsracer@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 6th Street','Milwaukee','WI','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (7,'Spritle Sprockets','Xie','Ming-Yang','spritle@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','123 7th Street','Boise','ID','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (8,'Company H','Andersen','Elizabeth','companyh@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','123 8th Street','Portland','OR','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (9,'Company I','Mortensen','Sven','companyi@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 9th Street','Salt Lake City','UT','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (10,'Company J','Wacker','Roland','companyj@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 10th Street','Chicago','IL','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (11,'Company K','Krschne','Peter','companyk@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 11th Street','Miami','FL','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (12,'Company L','Edwards','John','companyl@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','123 12th Street','Las Vegas','NV','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (13,'Company M','Ludick','Andre','companym@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','456 13th Street','Memphis','TN','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (14,'Company N','Grilo','Carlos','companyn@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','456 14th Street','Denver','CO','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (15,'Company O','Kupkova','Helena','companyo@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','456 15th Street','Honolulu','HI','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (16,'Company P','Goldschmidt','Daniel','companyp@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','456 16th Street','San Francisco','CA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (17,'Company Q','Bagel','Jean Philippe','companyq@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','456 17th Street','Seattle','WA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (18,'Company R','Autier Miconi','Catherine','companyr@email.com','Purchasing Representative','(123)555-0100',NULL,NULL,'(123)555-0101','456 18th Street','Boston','MA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (19,'Company S','Eggerer','Alexander','companys@email.com','Accounting Assistant','(123)555-0100',NULL,NULL,'(123)555-0101','789 19th Street','Los Angelas','CA','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (20,'Company T','Li','George','companyt@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 20th Street','New York','NY','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (21,'Company U','Tham','Bernard','companyu@email.com','Accounting Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 21th Street','Minneapolis','MN','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (22,'Company V','Ramos','Luciana','companyv@email.com','Purchasing Assistant','(123)555-0100',NULL,NULL,'(123)555-0101','789 22th Street','Milwaukee','WI','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (23,'Company W','Entin','Michael','companyw@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 23th Street','Portland','OR','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (24,'Company X','Hasselberg','Jonas','companyx@email.com','Owner','(123)555-0100',NULL,NULL,'(123)555-0101','789 24th Street','Salt Lake City','UT','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (25,'Company Y','Rodman','John','companyy@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 25th Street','Chicago','IL','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (26,'Company Z','Liu','Run','companyz@email.com','Accounting Assistant','(123)555-0100',NULL,NULL,'(123)555-0101','789 26th Street','Miami','FL','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (27,'Company AA','Toh','Karen','companyaa@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 27th Street','Las Vegas','NV','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (28,'MyCompany','Raghav','Amritansh','mycompany@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 28th Street','Memphis','TN','99999','USA',NULL,NULL);
INSERT INTO customer(CUST_ID_NUMBER, company, last_name, first_name, email_address, job_title, business_phone, home_phone, mobile_phone, fax_phone, address, city, state, zip_code, country, web_page, notes)
VALUES (29,'Company CC','Lee','Soo Jung','companycc@email.com','Purchasing Manager','(123)555-0100',NULL,NULL,'(123)555-0101','789 29th Street','Denver','CO','99999','USA',NULL,NULL);

-- Product Table
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (1,'NWTB-1','Northwind Traders Chai',NULL,13.5,18,10,40,'10 boxes x 20 bags',0,10,'Beverages');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (2,'NWTCO-3','Northwind Traders Syrup',NULL,7.5,10,25,100,'12 - 550 ml bottles',0,25,'Condiments');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (3,'NWTCO-4','Northwind Traders Cajun Seasoning',NULL,16.5,22,10,40,'48 - 6 oz jars',0,10,'Condiments');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (4,'NWTO-5','Northwind Traders Olive Oil',NULL,16.0125,21.35,10,40,'36 boxes',0,10,'Oil');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (5,'NWTJP-6','Northwind Traders Boysenberry Spread',NULL,18.75,25,25,100,'12 - 8 oz jars',0,25,'Jams, Preserves');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (6,'NWTDFN-7','Northwind Traders Dried Pears',NULL,22.5,30,10,40,'12 - 1 lb pkgs.',0,10,'Dried Fruit & Nuts');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (7,'NWTS-8','Northwind Traders Curry Sauce',NULL,30,40,10,40,'12 - 12 oz jars',0,10,'Sauces');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (8,'NWTDFN-14','Northwind Traders Walnuts',NULL,17.4375,23.25,10,40,'40 - 100 g pkgs.',0,10,'Dried Fruit & Nuts');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (9,'NWTCFV-17','Northwind Traders Fruit Cocktail',NULL,29.25,39,10,40,'15.25 OZ',0,10,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (10,'NWTBGM-19','Northwind Traders Chocolate Biscuits Mix',NULL,6.9,9.2,5,20,'10 boxes x 12 pieces',0,5,'Baked Goods & Mixes');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (11,'NWTJP-6','Northwind Traders Marmalade',NULL,60.75,81,10,40,'30 gift boxes',0,10,'Jams, Preserves');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (12,'NWTBGM-21','Northwind Traders Scones',NULL,7.5,10,5,20,'24 pkgs. x 4 pieces',0,5,'Baked Goods & Mixes');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (13,'NWTB-34','Northwind Traders Beer',NULL,10.5,14,15,60,'24 - 12 oz bottles',0,15,'Beverages');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (14,'NWTCM-40','Northwind Traders Crab Meat',NULL,13.8,18.4,30,120,'24 - 4 oz tins',0,30,'Canned Meat');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (15,'NWTSO-41','Northwind Traders Clam Chowder',NULL,7.2375,9.65,10,40,'12 - 12 oz cans',0,10,'Soups');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (16,'NWTB-43','Northwind Traders Coffee',NULL,34.5,46,25,100,'16 - 500 g tins',0,25,'Beverages');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (17,'NWTCA-48','Northwind Traders Chocolate',NULL,9.5625,12.75,25,100,'10 pkgs',0,25,'Candy');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (18,'NWTDFN-51','Northwind Traders Dried Apples',NULL,39.75,53,10,40,'50 - 300 g pkgs.',0,10,'Dried Fruit & Nuts');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (19,'NWTG-52','Northwind Traders Long Grain Rice',NULL,5.25,7,25,100,'16 - 2 kg boxes',0,25,'Grains');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (20,'NWTP-56','Northwind Traders Gnocchi',NULL,28.5,38,30,120,'24 - 250 g pkgs.',0,30,'Pasta');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (21,'NWTP-57','Northwind Traders Ravioli',NULL,14.625,19.5,20,80,'24 - 250 g pkgs.',0,20,'Pasta');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (22,'NWTS-65','Northwind Traders Hot Pepper Sauce',NULL,15.7875,21.05,10,40,'32 - 8 oz bottles',0,10,'Sauces');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (23,'NWTS-66','Northwind Traders Tomato Sauce',NULL,12.75,17,20,80,'24 - 8 oz jars',0,20,'Sauces');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (24,'NWTD-72','Northwind Traders Mozzarella',NULL,26.1,34.8,10,40,'24 - 200 g pkgs.',0,10,'Dairy Products');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (25,'NWTDFN-74','Northwind Traders Almonds',NULL,7.5,10,5,20,'5 kg pkg.',0,5,'Dried Fruit & Nuts');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (26,'NWTCO-77','Northwind Traders Mustard',NULL,9.75,13,15,60,'12 boxes',0,15,'Condiments');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (27,'NWTDFN-80','Northwind Traders Dried Plums',NULL,3,3.5,50,75,'1 lb bag',0,25,'Dried Fruit & Nuts');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (28,'NWTB-81','Northwind Traders Green Tea',NULL,2,2.99,100,125,'20 bags per box',0,25,'Beverages');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (29,'NWTC-82','Northwind Traders Granola',NULL,2,4,20,100,NULL,0,NULL,'Cereal');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (30,'NWTCS-83','Northwind Traders Potato Chips',NULL,0.5,1.8,30,200,NULL,0,NULL,'Chips, Snacks');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (31,'NWTBGM-85','Northwind Traders Brownie Mix',NULL,9,12.49,10,20,'3 boxes',0,5,'Baked Goods & Mixes');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (32,'NWTBGM-86','Northwind Traders Cake Mix',NULL,10.5,15.99,10,20,'4 boxes',0,5,'Baked Goods & Mixes');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (33,'NWTB-87','Northwind Traders Tea',NULL,2,4,20,50,'100 count per box',0,NULL,'Beverages');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (34,'NWTCFV-88','Northwind Traders Pears',NULL,1,1.3,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (35,'NWTCFV-89','Northwind Traders Peaches',NULL,1,1.5,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (36,'NWTCFV-90','Northwind Traders Pineapple',NULL,1,1.8,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (37,'NWTCFV-91','Northwind Traders Cherry Pie Filling',NULL,1,2,10,40,'15.25 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (38,'NWTCFV-92','Northwind Traders Green Beans',NULL,1,1.2,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (39,'NWTCFV-93','Northwind Traders Corn',NULL,1,1.2,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (40,'NWTCFV-94','Northwind Traders Peas',NULL,1,1.5,10,40,'14.5 OZ',0,NULL,'Canned Fruit & Vegetables');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (41,'NWTCM-95','Northwind Traders Tuna Fish',NULL,0.5,2,30,50,'5 oz',0,NULL,'Canned Meat');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (42,'NWTCM-96','Northwind Traders Smoked Salmon',NULL,2,4,30,50,'5 oz',0,NULL,'Canned Meat');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (43,'NWTC-82','Northwind Traders Hot Cereal',NULL,3,5,50,200,NULL,0,NULL,'Cereal');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (44,'NWTSO-98','Northwind Traders Vegetable Soup',NULL,1,1.89,100,200,NULL,0,NULL,'Soups');
INSERT INTO product(PROD_ID_NUMBER, product_code, product_name, description, standard_price, list_price, reorder_level, target_level, per_unit_measure, discontinued, minimum_reorder_level, category_name)
VALUES (45,'NWTSO-99','Northwind Traders Chicken Soup',NULL,1,1.95,100,200,NULL,0,NULL,'Soups');