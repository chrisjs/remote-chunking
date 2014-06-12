* mvn clean package
  * java -jar target/(master|slave).jar
  * The above is a shade'd jar so should run with all deps included.
* Run ActiveMQ locally with defaults, or edit application.properties.
* From IDE etc:
    * Run the Master class to execute the master node.
    * Run the Slave class to execute the slave node(s).
