#include <ESP8266WiFi.h>
#include <ThingSpeak.h>

WiFiClient client;

long myChannelNumber = CHNNEL_NUMBER;
const char myWriteAPIKey[] = "API KEY";

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  WiFi.begin("SSID", "PASSWORD");
  while(WiFi.status() != WL_CONNECTED)
  {
    delay(200);
    Serial.print("..");
  }
  Serial.println();
  Serial.println("NodeMCU is connected!");
  Serial.println(WiFi.localIP());
  ThingSpeak.begin(client);
}

void loop() {
  // put your main code here, to run repeatedly:
  float h = 0.0;
  float t = dht.readTemperature();
  Serial.println("Temperature: " + (String) t);
  ThingSpeak.writeField(myChannelNumber, 1, t, myWriteAPIKey);
  delay(2000);
  h+=1.0;
}
