CREATE TYPE marque_enum AS ENUM ('FORD', 'GMC', 'DODGE');
CREATE TYPE modele_enum AS ENUM ('RANGER', 'EVEREST', 'YUKON', 'RAM');


CREATE TABLE modele_voiture (
                                id          SERIAL PRIMARY KEY,
                                marque      marque_enum NOT NULL,
                                modele      modele_enum NOT NULL
);

CREATE TABLE mecanicien (
                            id          SERIAL PRIMARY KEY,
                            nom         VARCHAR(100) NOT NULL,
                            marque      marque_enum NOT NULL
);

CREATE TABLE reparation (
                            id                  SERIAL PRIMARY KEY,
                            id_mecanicien       INTEGER NOT NULL,
                            id_modele_voiture   INTEGER NOT NULL,
                            cout                DECIMAL(12,2) NOT NULL CHECK (cout > 0),

                            CONSTRAINT fk_reparation_mecanicien
                                FOREIGN KEY (id_mecanicien)
                                    REFERENCES mecanicien(id)
                                    ON DELETE CASCADE,

                            CONSTRAINT fk_reparation_modele
                                FOREIGN KEY (id_modele_voiture)
                                    REFERENCES modele_voiture(id)
                                    ON DELETE RESTRICT
);