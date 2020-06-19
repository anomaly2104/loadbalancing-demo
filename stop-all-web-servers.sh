#!/bin/bash
procs=`ps aux | grep "loadbalancing" | awk '{print $2}'`

for i in $procs
do
	`sudo kill $i`
done
