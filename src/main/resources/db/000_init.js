db = db.getSiblingDB('mydatabase'); //use mydatabase
db.customer.save({"firstname":"Alice", "lastname":"Smith"})
db.customer.save({"firstname":"Bob", "lastname":"Johnson"})