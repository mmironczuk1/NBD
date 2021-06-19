var m = function () {
	emit(this.job, null);
};

var r = function (key, values) {
	return null;
};

db.results_3.drop();

printjson(db.people.mapReduce(m, r, {out: "results_3"}));

printjson(db.results_3.distinct("_id"));
