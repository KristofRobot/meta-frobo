#!/bin/bash
IMAGE=$1
sudo kpartx -a -v ${IMAGE} 

sudo mount /dev/mapper/loop0p2 /mnt 
ls /mnt 
ls /mnt/usr
read -p "Press [Enter] key to unmount..."
sudo umount /mnt 

sudo mount /dev/mapper/loop0p1 /mnt2 
cat /mnt2/image-version-info 
sudo umount /mnt2 

sudo kpartx -d -v ${IMAGE}
