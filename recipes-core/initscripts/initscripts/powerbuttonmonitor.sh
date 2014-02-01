#!/bin/sh
#block until button is pressed
read line </dev/input/event0
#shutdown
shutdown -h now
