#!/bin/sh

find src -name "*.java" \
    -and -not -path "src/j0beron2/*" \
    -and -not -path "src/j0beron/utils*" \
    -and -not -path "src/j0beron/parser/Oberon0Parser.java" > javancss.lst


find src -name "*.java" \
    -and -not -path "src/j0beron/*" \
    -and -not -path "src/j0beron2/utils*" \
    -and -not -path "src/j0beron2/parser/Oberon0Parser.java" > javancss2.lst


		

