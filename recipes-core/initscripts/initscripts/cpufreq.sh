#!/bin/sh
### BEGIN INIT INFO
# Provides:          cpufreq
# Required-Start:
# Required-Stop:
# Default-Start:     S
# Default-Stop:
# Short-Description: Set CPU frequency profile
### END INIT INFO
echo -n "Setting ondemand CPU frequency profile"
echo ondemand > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
echo 336000 > /sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq
echo 912000 > /sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq
#More aggressive
#echo 1008000 > /sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq
echo 40 > /sys/devices/system/cpu/cpufreq/ondemand/up_threshold
echo 200000 > /sys/devices/system/cpu/cpufreq/ondemand/sampling_rate
