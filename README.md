# DetroitLabs
To build run "./gradlew assemble" and grab the jar out of build/libs. Once the jar is created run "java -jar build/libs/TacoLoco-1.0-SNAPSHOT.jar". The endpoint is a POST located at /calculateTotal. The requet body should be formatted as such:

{
	"veggieTaco": 1,
	"chickenTaco": 1,
	"beefTaco": 1,
	"chorizoTaco": 1
}
