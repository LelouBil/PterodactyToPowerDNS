##PterodactylToPowerDNS

Simple application that syncs pterodactyl servers with PowerDNS records

It uses the external id field in the pterodactyl server info as subdomain

This app also has support for SRV records for minecraft servers

To use : 
place a `pteropowerdns.properties` file in the same directory as the jar and fill this sample configuration

````properties

powerdns-url=http://powerdns.api:8081/api/v1
powerdns-apikey=<PowerDNS Api Key>
powerdns-serverid=<PowerDNS Server Id>
powerdns-zoneid=<PowerDNS zone id>
powerdns-username=<Powerdns Username>
add-srv=true

pterodactyl-url=<Pterodactyl panel url>
pterodactyl-apikey=<Pterodactyl panel api key>
````

