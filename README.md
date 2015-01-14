# wmjug-docker-example
<p>A very simple dockerized Random Whale generator spring boot app using rhuss maven plugin to build images using the maven lifecycle.</p>

<p>https://github.com/rhuss/docker-maven-plugin<p>

<p>The original presentation can be found here: <b><i>https://docs.google.com/presentation/d/1oL0X5nZ5h78E_NNB9ATI8l1hIiWSKmgkSp2DkACppzE/edit?usp=sharing</i></b></p>

<b>Use</b>

<ul>
  <li>Install & configure Docker for your OS (https://docs.docker.com/installation/#installation)</li>
  <li>Check that it is started correctly by issuing <b><i>docker info<i></b> at the command line</li>
  <li>Install Maven 3.2.1+ & Java 8</li>
  <li>Run <b><i>mvn verify</i></b> to run unit, build and start a container, run integration tests then stop the container</li>
</ul>

<p>Once this process is complete, you will have a full unit & integration tested available docker image which can be run using:<p>

<p><i><b>docker run -i -p 8080:8080 mattjtodd/docker-micro:0.1.0-SNAPSHOT</b</i></p>

<p>You will then be able to access the randomWhale service using curl:</p>

<p><i><b>curl http://the-ip-of-your-docker-engine:8080/randomWhale</b</i></p>

<p>It would also be possible to push the image to a docker hub as part of the build process.  See the maven plugin docs for more details<p>

<p> There seems to be a problem on my machine (OSX, boot2docker) where the spring boot app fails to start properly occasionally.  I'm not sure what is causing this or if it's a problem in linux docker engines as well.  If you can reproduce the problem, feel free to comment / discuss in the github issue.</p>

