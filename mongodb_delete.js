var MongoClient=require('mongodb').MongoClient;
var url="mongodb://localhost:27017/";

MongoClient.connect(url,function(err,db){
    if(err)
    throw err;
    var dbo=db.db("mydb");
    var myobj={name:'Swapnil'};
    dbo.collection("customers").deleteOne(myobj,function(err,obj){
        if(err)
        throw err;
        console.log("1 Document deleted!");
        db.close();
    });
});