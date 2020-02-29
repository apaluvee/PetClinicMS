use petclinicMS;

SET GLOBAL log_bin_trust_function_creators = 1;


create table veterinarian(
vet_id INT (5) AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR (20) NOT NULL,
last_name VARCHAR (20) NOT NULL,
address VARCHAR (100),
speciality VARCHAR (50),
email VARCHAR (20),
phone VARCHAR (20),
FOREIGN KEY (cousult_id) REFERENCES consultation (consult_id) ON DELETE CASCADE ON UPDATE CASCADE
);

create table consultation(
consult_id INT (5) AUTO_INCREMENT PRIMARY KEY,
FOREIGN KEY (vet_id ) REFERENCES veterinarian (vet_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (pet_id ) REFERENCES pet (pet_id) ON DELETE CASCADE ON UPDATE CASCADE,
consult_date timestamp default now(),
consult_description longtext
);

CREATE TABLE pet (
    pet_id  INT (5) AUTO_INCREMENT PRIMARY KEY,
    species VARCHAR(50),
    pet_name VARCHAR(50) NOT NULL,
    owner_name VARCHAR(50) NOT NULL,
    dob DATE
);

CREATE TABLE vaccine (
    vaccine_id INT (5) AUTO_INCREMENT PRIMARY KEY,
    vaccine_name VARCHAR (25) NOT NULL,
    vaccine_description longtext
);

CREATE TABLE pet_vaccine (
    FOREIGN KEY (pet_id ) REFERENCES pet (pet_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (vaccine_id ) REFERENCES vaccine (vaccine_id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (consult_id ) REFERENCES veterinarian (consult_id) ON DELETE CASCADE ON UPDATE CASCADE
);

