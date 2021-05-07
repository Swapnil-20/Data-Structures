var MongoClient=require('mongodb').MongoClient;
var url="mongodb://localhost:27017/";

MongoClient.connect(url,function(err,db){
    if(err)
    throw err;
    var dbo=db.db("mydb");
    var q={address:"Yellow Garden 2"};
    var n={$set:{address:"Ratan Orbit"}};
    dbo.collection("customers").updateOne(q,n,function(err,res){
        if(err)
        throw err;
        console.log("1 Document Updated!");
        db.close();
    })
})