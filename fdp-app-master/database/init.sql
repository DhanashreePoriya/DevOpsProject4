CREATE TABLE registrations(
    id SERIAL PRIMARY KEY,
    unique_id VARCHAR(50) UNIQUE,
    name VARCHAR(100),
    department VARCHAR(100),
    workshop_mode VARCHAR(50)
);
