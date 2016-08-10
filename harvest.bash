#!/bin/bash

URL = "http://www.gutenberg.org/robot/harvest?filetypes[]=txt";

wget -w 2 -m -H $URL -P $PWD;
cd www.gutenberg.lib.md.us;
find . -name "*.txt" -print0 | xargs -0 -I file cat file > "gutenberg.txt";
