# wmjug-docker-example
<p>A very simple dockerized Random Whale generator spring boot app using spotify maven plugin to build images using the maven lifecycle.</p>

<p>The original presentation can be found here: <b><i>https://docs.google.com/presentation/d/1oL0X5nZ5h78E_NNB9ATI8l1hIiWSKmgkSp2DkACppzE/edit?usp=sharing</i></b></p>

<b>Howto</b>

<ul>
  <li>Install & configure Docker for your OS (https://docs.docker.com/installation/#installation)</li>
  <li>Check that it is started correctly by issuing <b><i>docker info<i></b> at the command line</li>
  <li>Install Maven 3 & Java 8</li>
  <li>Run <b><i>mvn clean package docker:build</i></b> to create the spring boot jar and build a docker image</li>
  <li>Run <b><i>docker run -i -p 8080:8080 wmjug-docker-random-whale</i></b></li>
  <li>Run <b><i>curl http://ip-of-your-docker-app:8080/randomWhale</i></b> Should output a random whale JSON object</li>
</ul>

