var m = function () {
	for (var i=0; i<this.credit.length; i++){
		var key = this.credit[i].currency;
		var value = this.credit[i].balance;
		emit(key, value);
	};
	
};

var r = function (key, values) {
	return Array.sum(values);
};

printjson(db.people.mapReduce(m, r, {out: "results_2"}));

printjson(db.results_2.find().toArray());
