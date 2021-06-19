var m = function() {
	var h = this.height;
	var w = this.weight;
	var BMI = 10000*w/(h*h);
	emit(this.nationality, {bmi:BMI, count:1, max_bmi:BMI, min_bmi:BMI});
};

var r = function(key, values) {
	var n = {bmi:0, count:0, max_bmi:0, min_bmi:0};
	n.min_bmi = values[0].min_bmi;
	n.max_bmi = values[0].max_bmi;
	for (var i=0; i<values.length; i++){
		n.bmi += values[i].bmi;
		n.count += values[i].count;
		if (values[i].max_bmi>n.max_bmi) n.max_bmi = values[i].max_bmi;
		if (values[i].min_bmi<n.min_bmi) n.min_bmi = values[i].min_bmi;
	}

	return n;
};

var f = function(key, result) {
	result.avg_bmi = result.bmi/result.count;
	return {avg_bmi:result.avg_bmi, max_bmi:result.max_bmi, min_bmi:result.min_bmi};
};

db.results_4.drop();

printjson(db.people.mapReduce(m, r, {finalize:f, out: "results_4"}));

printjson(db.results_4.find().toArray());
