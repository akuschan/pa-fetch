#!/bin/sh

ulimit -s unlimited

java -cp `lein classpath` jline.ConsoleRunner clojure.main 


