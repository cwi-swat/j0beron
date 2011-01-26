#!/bin/sh

find src/j0beron/visitor -name "*.java" \
    -and -not -path "src/j0beron/visitor/parser/Oberon0Parser.java" > visitor.files


find src/j0beron/interpreter -name "*.java" \
    -and -not -path "src/j0beron/interpreter/parser/Oberon0Parser.java" > interpreter.files


		

