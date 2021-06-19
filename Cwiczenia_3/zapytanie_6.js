printjson(db.people.insertOne({
	"sex" : "Male",
	"first_name" : "Michal",
	"last_name" : "Mironczuk",
	"job" : "Project Leader",
	"email" : "s23303@pjwstk.edu.pl",
	"location" : {
		"city" : "Warsaw",
		"address" : {
			"streetname" : "Kolorowa",
			"streetnumber" : "32"
		}
	},
	"description" : "Opis opis opis",
	"height" : "189",
	"weight" : "83",
	"birth_date" : "1997-09-24T01:10:11Z",
	"nationality" : "Poland",
	"credit" : [
		{
			"type" : "visa",
			"number" : "4060967140337",
			"currency" : "SGD",
			"balance" : "43444.32"
		}
	]
}
)
)

