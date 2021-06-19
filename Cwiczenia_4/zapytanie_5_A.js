printjson(db.people.aggregate([
	{$unwind:"$credit"}, 
	{$match:{$and:[{"sex":"Female"},{"nationality":"Poland"}]}},
	{$group:
		{_id:"$credit.currency", 
		currency_sum:{$sum:"$credit.balance"}, 
		currency_avg:{$avg:"$credit.balance"}}
	}]).toArray())
