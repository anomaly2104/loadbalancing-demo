#!/bin/bash
procs=`ps aux | grep "haproxy" | awk '{print $2}'`

for i in $procs
do
	`sudo kill $i`
done
