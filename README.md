# Pathfinder-comparison
Comparision of multiple frameworks on the same simple application

A simple application that provides a REST endpoint that returns a JSON response. The application computes the response in a transaction and uses a dependency injection framework to inject another object to provide data.

The REST endpoint is accessible at:

[http://localhost:8080/pathfinder/rest/graph-traversal/shortest-path?origin=CNHKG&destination=DEHAM](http://localhost:8080/pathfinder/rest/graph-traversal/shortest-path?origin=CNHKG&destination=DEHAM)

The endpoint accepts to parameters:

 - origin - an id of the original location for a path
 - destination - an id of a final location for a path

The result contains multiple possible paths from origin to destination thrugh existing locations connected by a direct route.