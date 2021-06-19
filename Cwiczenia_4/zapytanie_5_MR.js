var m = function () {
	for (var i=0; i<this.credit.length; i++){
		var key = this.credit[i].currency;
		var value = this.credit[i].balance;
		emit(key, {balance:value, count:1});
	};
	
};

var r = function (key, values) {
	var n = {balance:0, count:0};
	for (var i=0;i<values.length;i++){
		n.balance += values[i].balance;
		n.count += values[i].count;
	};
	return n;
};

var f = function (key, result) {
	result.balance_avg=result.balance/result.count;
	return {balance_total:result.balance, balance_avg:result.balance_avg};
};

printjson(db.people.mapReduce(m, r, {query:{$and:[{"sex":"Female"}, {"nationality":"Poland"}]}, finalize:f, out: "results_5"}));

printjson(db.results_5.find().toArray());
