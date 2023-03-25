INSERT INTO worker (name, birthday, level, salary) VALUES
('Petro Krasiy', '1986-05-26', 'Middle', 2600),
('John Kramer', '1992-11-16', 'Trainee', 900),
('Laslo Svensen', '1975-07-13', 'Senior', 6500),
('Olena Netreba', '1989-01-20', 'Junior', 1500),
('Ivan Kardash', '1995-05-01', 'Trainee', 800),
('Olga Chudyk', '1983-07-07', 'Junior', 1200),
('Oleg Shevchenko', '1993-05-05', 'Middle', 2300),
('Danylo Fedyk', '1986-07-07', 'Senior', 5200),
('Oksana Pavliv', '1997-05-26', 'Junior', 1300),
('Rob McNill', '1985-02-17', 'Middle', 2200);

INSERT INTO client (name) VALUES
'Jaroslav Boykiv',
'Igor Sosulja',
'Ben Woles',
'Rob Shneider',
'Margo Robby';

INSERT INTO project (client_id, start_date, finish_date) VALUES
(1, '2022-07-07', '2023-09-09'),
(1, '2023-01-20', '2025-12-31'),
(2, '2023-03-07', '2025-06-01'),
(3, '2021-10-24', '2024-03-27'),
(3, '2022-12-14', '2024-06-30'),
(3, '2021-01-24', '2024-12-09'),
(4, '2022-04-08', '2023-01-10'),
(4, '2022-11-07', '2025-01-08'),
(5, '2023-03-01', '2023-04-02'),
(1, '2023-02-07', '2023-05-01');

INSERT INTO project_worker (project_id, worker_id) VALUES
(1,1), (1,3), (1,6), (1,4),
(2,1), (2,10),
(3,7), (3,6), (3,9),
(4,5),
(5,2), (5,10),
(6,8),
(7,3), (7,4), (7,5),
(8,1),
(9,7), (9,8),
(10,2);