var process = function(collection) {
	return function(customer) {
		var oldname = customer.lastname;
		if(oldname != null && oldname.length > 0) {
			print('change customer: ' + customer.firstname + " " + customer.lastname);
			customer.lastname = oldname.charAt(0) + '.';
			
		}
		collection.save(customer);
	}
};

db = db.getSiblingDB('mydatabase'); //use mydatabase
db.customer.find().forEach(process(db.customer));