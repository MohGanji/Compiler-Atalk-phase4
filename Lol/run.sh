export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
rm *.class
rm *.tokens
rm Lol*.java
java -jar /usr/local/lib/antlr-4.7-complete.jar Lol.g4
javac *.java
java org.antlr.v4.gui.TestRig Lol program -gui < ./in.lol