const sqlite3 = require("sqlite3").verbose();

const db = new sqlite3.Database('./MyDatabase.db', sqlite3.OPEN_READWRITE, (err)=>{
     if(err) return console.error(err.message);

     console.log("connection succesfful");
})

let sql;

// function addData(idInsert, nameInsert){
//     sql = `INSERT INTO MyTable (id, name)
//             VALUES(?,?)`;
//     db.run(sql,[idInsert, nameInsert], (err)=>{
//         if(err) return console.error(err.message);

//         console.log("New data is added")
// })
// }
// addData();

function display() {  
    alert("Hello World!");  
}  

document.getElementById("demo").addEventListener("click", myFunction);

function myFunction() {
  document.getElementById("demo").innerHTML = showData;
}

function showData(){
    sql = `SELECT id, name FROM MyTable`;
    
    db.all(sql, [], (err, rows)=>{
        rows.forEach((row)=>{
            console.log = row;
        })
    })

}
showData();

function updateName(newName, currentID){
    sql = `UPDATE MyTable SET name = ? WHERE id = ?`
    db.run(sql,[newName, currentID], (err)=>{
        if(err) return console.error(err.message);

        console.log(`${newName} is updated`)
    })
}
// updateName('Pederast', 69);

function deleteUserByID(id){
    sql = `DELETE FROM MyTable WHERE id=?`
    db.run(sql,[id], (err)=>{
        if(err) return console.error(err.message);

        console.log(`${id} is deleted`)
    })
}
// deleteUserByID('asd');

db.close((err)=>{
    if (err) return console.error(err.message);
})