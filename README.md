Calculator.java:
Code: 129 lines
Comments: 5 lines
Empty lines: 54 lines
Total LOC: 188 lines

Start.java:
Code: 19 Lines
Empty lines: 7 lines
Total LOC: 26 lines

Total code (both):
Code: 148 lines
Comments: 5 lines
Empty lines: 61 lines
Total LOC: 214



Neformalan pregled koda:

Calculator.java – linija 18 – ToString() nije u skladu sa Java konvencijom imenovanja

Calculator.java – linija 24 – Run(String expression) nije u skladu sa Java konvencijom imenovanja

Calculator.java – linija 32 – expression.charAt(0) izaziva grešku ako korisnik ne unese nista. Ne postoji nista ni u Start.java sto bi ovo sprecilo

Calculator.java – linija 69 – Calculate(numberList, operationList) nije u skladu sa Java konvencijom imenovanja

Start.java - linija 6 - String Expression nije u skladu sa Java konvencijom imenovanja



Staticka analiza koda (koriscen PMD for Java):

Calculator.java:


	"resource": "/C:/Users/Korisnik/dev/Assignment Calculator/Calculator.java",
	"owner": "_generated_diagnostic_collection_name_#1",
	"code": "hints(5): 53:9-53:12",
	"severity": 4,
	"message": "Use enhanced for loop to iterate over the array",
	"startLineNumber": 53,
	"startColumn": 9,
	"endLineNumber": 53,
	"endColumn": 12,
	"modelVersionId": 1,
	"origin": "extHost1"


	"resource": "/C:/Users/Korisnik/dev/Assignment Calculator/Calculator.java",
	"owner": "_generated_diagnostic_collection_name_#1",
	"code": "hints(3): 55:13-55:15",
	"severity": 4,
	"message": "Convert to switch",
	"startLineNumber": 55,
	"startColumn": 13,
	"endLineNumber": 55,
	"endColumn": 15,
	"modelVersionId": 1,
	"origin": "extHost1"


	"resource": "/C:/Users/Korisnik/dev/Assignment Calculator/Calculator.java",
	"owner": "_generated_diagnostic_collection_name_#1",
	"code": "hints(1): 62:36-62:64",
	"severity": 4,
	"message": "Unnecessary temporary when converting from String",
	"startLineNumber": 62,
	"startColumn": 36,
	"endLineNumber": 62,
	"endColumn": 64,
	"modelVersionId": 1,
	"origin": "extHost1"


	"resource": "/C:/Users/Korisnik/dev/Assignment Calculator/Calculator.java",
	"owner": "_generated_diagnostic_collection_name_#1",
	"code": "hints(2): 63:26-63:35",
	"severity": 4,
	"message": "Can be replaced with multicatch or several catch clauses catching specific exceptions",
	"startLineNumber": 63,
	"startColumn": 26,
	"endLineNumber": 63,
	"endColumn": 35,
	"modelVersionId": 1,
	"origin": "extHost1"


	"resource": "/C:/Users/Korisnik/dev/Assignment Calculator/Calculator.java",
	"owner": "_generated_diagnostic_collection_name_#1",
	"code": "hints(4): 183:13-183:20",
	"severity": 4,
	"message": "Unnecessary return statement",
	"startLineNumber": 183,
	"startColumn": 13,
	"endLineNumber": 183,
	"endColumn": 20,
	"modelVersionId": 1,
	"origin": "extHost1"


Calculator.java – linija 53	– Use enhanced for loop to iterate over the array	

Calculator.java – linija 55	– Convert to switch	

Calculator.java – linija 62 –	Unnecessary temporary when converting from String	

Calculator.java – linija 63 –	Can be replaced with multicatch or several catch clauses catching specific exceptions

Calculator.java – linija 183 – Unnecessary return statement	
