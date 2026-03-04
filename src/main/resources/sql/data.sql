INSERT INTO modele_voiture (marque, modele) VALUES
                                                ('FORD', 'RANGER'),
                                                ('FORD', 'EVEREST'),
                                                ('GMC', 'YUKON'),
                                                ('DODGE', 'RAM');

INSERT INTO mecanicien (nom, marque) VALUES
                                         ('Jean Dupont', 'FORD'),
                                         ('Marc Martin', 'GMC'),
                                         ('Paul Leroy', 'DODGE'),
                                         ('Sophie Bernard', 'FORD');

INSERT INTO reparation (id_mecanicien, id_modele_voiture, cout) VALUES
                                                                    (1, 1, 1250.50),
                                                                    (1, 2, 890.00),
                                                                    (2, 3, 2450.75),
                                                                    (3, 4, 3200.00),
                                                                    (4, 1, 675.25);