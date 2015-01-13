# wmjug-docker-example
A very simple dockerized Random Whale generator spring boot app using spotify maven plugin to build images using the maven lifecycle.

<b>Howto</b>

<ul>
  <li>Install & configure Docker for your OS (https://docs.docker.com/installation/#installation)</li>
  <li>Check that it is started correctly by issuing <b><i>docker info<i></b> at the command line</li>
  <li>Install Maven 3 & Java 8</li>
  <li>Run <b><i>mvn clean package docker:build</i></b> to create the spring boot jar and build a docker image</li>
  <li>Run <b><i>docker run -i -p 8080:8080 wmjug-docker-random-whale</i></b></li>
  <li>Run <b><i>curl http://ip-of-your-docker-app:8080/randomeWhale</i></b> Should output a random whale JSON object</li>
</ul>

