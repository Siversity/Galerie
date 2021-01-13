-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Boolemart', 'Louvres, Paris');
INSERT INTO Galerie(id, nom, adresse) VALUES (3, 'Frankein', 'Weirmat, Berlin');

INSERT INTO Exposition(id, debut, intitule, duree, organisateur_id) VALUES (11, '2000-08-01', 'Exposition de Picasso', 14, 1);
INSERT INTO Exposition(id, debut, intitule, duree, organisateur_id) VALUES (12, '2001-07-14', 'Exposition classique au Louvre', 5, 1);
INSERT INTO Exposition(id, debut, intitule, duree, organisateur_id) VALUES (13, '2007-01-01', 'Exposition éphémère au Louvre', 1, 2);
INSERT INTO Exposition(id, debut, intitule, duree, organisateur_id) VALUES (14, '2020-12-11', 'Exposition 2nd Guerre Mondiale', 7, 3);

INSERT INTO Personne(id, nom, adresse, dtype) VALUES (45, 'Buten', 'Paris', 'P');
INSERT INTO Personne(id, nom, adresse, dtype) VALUES (46, 'Tador', 'New-York', 'P');
INSERT INTO Personne(id, nom, adresse, biographie, dtype) VALUES (21, 'Picasso', 'Espagne', 'Artiste cubique', 'P');
INSERT INTO Personne(id, nom, adresse, biographie, dtype) VALUES (22, 'Vincent Van Gogh', 'Pays-Bas', 'Artiste expressioniste et fauviste', 'P');
INSERT INTO Personne(id, nom, adresse, biographie, dtype) VALUES (23, 'Claude Monnet', 'France', 'Artiste impressioniste', 'P');
INSERT INTO Personne(id, nom, adresse, biographie, dtype) VALUES (24, 'Pierre Paul Rubens', 'Belgique, Allemagne', 'Artiste baroque', 'P');


INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur_id) VALUES (31, 'Guernica', 'Toile', 349, 777, 21);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur_id) VALUES (32, 'La Nuit étoilée', 'Toile', 74, 92, 22);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur_id) VALUES (33, 'Le Bassin aux nymphéas', 'Toile', 74, 93, 23);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur_id) VALUES (34, 'Autoportrait', 'Toile', 71, 91, 24);


INSERT INTO Transaction(id, vendu_Le, prix_Vente, client_id, lieu_de_vente_id, oeuvre_id) VALUES (51, '2020-01-25', 1, 45, 11, 31);
INSERT INTO Transaction(id, vendu_Le, prix_Vente, client_id, lieu_de_vente_id, oeuvre_id) VALUES (52, '2020-06-21', 6, 45, 11, 32);
