#!/bin/sh
#block until button is pressed
dd if=/dev/input/event0 count=1 > /dev/null 2>&1

if [ $? == 0 ]
then
        #shutdown
        echo "Power button pressed - shutting down..."
        shutdown -h now       
else                                                       
        echo "ERROR: powerbutton script crashed - quitting"
fi
