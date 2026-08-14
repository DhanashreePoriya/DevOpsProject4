function register(){

    const data = {

        unique_id:
        document.getElementById("uid").value,

        name:
        document.getElementById("name").value,

        department:
        document.getElementById("department").value,

        workshop_mode:
        document.getElementById("mode").value
    };

    fetch(
        "http://localhost:5000/register",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(data)
        }
    )
    .then(response=>response.json())
    .then(result=>{

        alert(result.message);

    });
}
