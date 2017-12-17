export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
rm *.class
rm *.tokens
rm LolPass1*.java
rm LolPass2*.java
java -jar /usr/local/lib/antlr-4.7-complete.jar LolPass1.g4
java -jar /usr/local/lib/antlr-4.7-complete.jar LolPass2.g4
javac *.java
java Lol in.lol