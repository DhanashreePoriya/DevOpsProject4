const express = require("express");
const cors = require("cors");
const pool = require("./db");

const app = express();

app.use(cors());
app.use(express.json());

app.post("/register", async (req, res) => {

    const {
        unique_id,
        name,
        department,
        workshop_mode
    } = req.body;

    await pool.query(
        `INSERT INTO registrations
        (unique_id,name,department,workshop_mode)
        VALUES($1,$2,$3,$4)`,
        [unique_id,name,department,workshop_mode]
    );

    res.json({
        message: "Registration Successful"
    });
});

app.get("/registrations", async(req,res)=>{

    const result =
    await pool.query(
        "SELECT * FROM registrations"
    );

    res.json(result.rows);
});

app.listen(5000,()=>{
    console.log("API Running on Port 5000");
});
