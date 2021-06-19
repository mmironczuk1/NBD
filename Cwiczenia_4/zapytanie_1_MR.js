var m = function () {
	emit(this.sex, {weight:this.weight, height:this.height, count:1});
};

var r = function (key, values) {
	var n = {weight:0, height:0, count:0};
	for (var i=0; i<values.length; i++) {
		n.weight += values[i].weight;
		n.height += values[i].height;
		n.count += values[i].count;
	};
	return n;
};

var f = function (key, result) {
	result.height_avg = result.height/result.count;
	result.weight_avg = result.weight/result.count;
	return {height_avg:result.height_avg, weight_avg:result.weight_avg};
};

printjson(db.people.mapReduce(m, r, {finalize: f, out: "results_1"}));

printjson(db.results_1.find().toArray());
