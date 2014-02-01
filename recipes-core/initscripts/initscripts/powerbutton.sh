### BEGIN INIT INFO
# Provides:         powerbutton 
# Required-Start:
# Required-Stop:
# Default-Start:     S
# Default-Stop:
# Short-Description: Shuts down system when power button pressed 
### END INIT INFO

echo "Starting power button monitor"
/usr/bin/powerbuttonmonitor.sh &
