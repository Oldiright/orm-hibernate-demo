INSERT INTO Client(name) VALUES
    ('Jon Dou'),
    ('Lisa Dou'),
    ('Tony Stark'),
    ('Reed Richards'),
    ('Susan Storm'),
    ('Steven Grant Rogers'),
    ('Wanda Maximoff'),
    ('Wade Wilson'),
    ('Erik Lehnsherr'),
    ('Charles Francis Xavier');

INSERT INTO planet(id, name) VALUES
    ('MRY', 'Mercury'),
    ('VNS', 'Venus'),
    ('ERT', 'Earth'),
    ('MRS', 'Mars'),
    ('JPT', 'Jupiter');

INSERT INTO TICKET(client_id, from_planet_id, to_planet_id) values
    (SELECT id FROM client WHERE name = 'Jon Dou', 'MRS', 'ERT'),
    (SELECT id FROM client WHERE name = 'Lisa Dou', 'ERT', 'MRS'),
    (SELECT id FROM client WHERE name = 'Tony Stark', 'ERT', 'JPT'),
    (SELECT id FROM client WHERE name = 'Reed Richards', 'VNS', 'ERT'),
    (SELECT id FROM client WHERE name = 'Susan Storm', 'ERT', 'VNS'),
    (SELECT id FROM client WHERE name = 'Steven Grant Rogers', 'JPT', 'MRY'),
    (SELECT id FROM client WHERE name = 'Wanda Maximoff', 'MRY', 'VNS'),
    (SELECT id FROM client WHERE name = 'Wade Wilson', 'ERT', 'MRY'),
    (SELECT id FROM client WHERE name = 'Erik Lehnsherr', 'MRS', 'JPT'),
    (SELECT id FROM client WHERE name = 'Charles Francis Xavier', 'MRS', 'JPT');


