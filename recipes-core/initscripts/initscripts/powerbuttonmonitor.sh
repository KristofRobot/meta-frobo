#!/bin/sh
while read line; do 
	echo "Power button pressed"
done </dev/input/event0
shutdown -h now
