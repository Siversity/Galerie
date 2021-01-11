-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES ( 1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES ( 2, 'Boolemart', 'Louvres, Paris');
INSERT INTO Galerie(id, nom, adresse) VALUES ( 3, 'Frankein', 'Weirmat, Berlin');

INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (1, '2000-08-01', 'Exposition de Picasso', 14, 1);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (2, '2001-07-14', 'Exposition classique au Louvre', 5, 2);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (3, '2007-01-01', 'Exposition éphémère au Louvre', 1, 2);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (4, '2020-12-11', 'Exposition 2nd Guerre Mondiale', 7, 3);

INSERT INTO Artiste(id, nom, adresse, bibliographie) VALUES (1, 'Picasso', 'Espagne', 'Artiste cubique');
INSERT INTO Artiste(id, nom, adresse, bibliographie) VALUES (2, 'Vincent Van Gogh', 'Pays-Bas', 'Artiste expressioniste et fauviste');
INSERT INTO Artiste(id, nom, adresse, bibliographie) VALUES (3, 'Claude Monnet', 'France', 'Artiste impressioniste');
INSERT INTO Artiste(id, nom, adresse, bibliographie) VALUES (4, 'Pierre Paul Rubens', 'Belgique, Allemagne', 'Artiste baroque');

INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur) VALUES (1, 'Guernica', 'Toile', 3.49, 7,77, 1);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur) VALUES (2, 'La Nuit étoilée', 'Toile', 0.74, 0.92, 2);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur) VALUES (3, 'Le Bassin aux nymphéas', 'Toile', 0.74, 0.93, 3);
INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur) VALUES (4, 'Autoportrait', 'Toile', 0.708, 0.913, 4);

INSERT INTO Personne(id, nom, adresse) VALUES (5, 'Buten', 'Paris');
INSERT INTO Personne(id, nom, adresse) VALUES (6, 'Tador', 'New-York');

INSERT INTO Transaction(id, vendu_Le, prix_Vente, lieu_De_Vente, oeuvre, client) VALUES (1, '2020-01-25', 1000000, 2, 1, 5);
INSERT INTO Transaction(id, vendu_Le, prix_Vente, lieu_De_Vente, oeuvre, client) VALUES (2, '2020-06-21', 5000000, 2, 2, 5);