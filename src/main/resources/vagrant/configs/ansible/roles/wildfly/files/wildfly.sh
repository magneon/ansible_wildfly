#!/bin/bash

case "$1" in
  start)
    /bin/wildfly/bin/standalone.sh &
    echo $!>/var/run/wildfly.pid
    ;;
  stop)
    kill `cat /var/run/wildfly.pid`
    rm /var/run/wildfly.pid
    ;;
  restart)
    $0 stop
    $0 start
    ;;
  status)
    if [ -e /var/run/wildfly.pid ]; then
      echo standalone.sh is running, pid=`cat /var/run/wildfly.pid`
    else
      echo standalone.sh is NOT running
    fi
    ;;
  *)
    echo "Usage {start|stop|status|restart}"
esac

exit 0
