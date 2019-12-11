
from('timer:tick')
  .setBody().simple('Num ${header.CamelTimerCounter}')
  .to('paho:mytopic?brokerUrl=tcp://mosquitto:1883')
