printjson(db.people.aggregate([
	{$project:{"nationality":"$nationality","BMI":{$divide:[{$multiply:["$weight",10000]},{$multiply:["$height","$height"]}]}}}, 
	{$group:{"_id":"$nationality", BMI_avg:{$avg:"$BMI"}, BMI_max:{$max:"$BMI"}, BMI_min:{$min:"$BMI"} 
	}}]).toArray())
