import httplib

host = "http://localhost:4567"
conn = httplib.HTTPConnection("localhost","4567")
body = "**********ALARAM*******************"
conn.request("POST", "/nany/alarm", body)
r1 = conn.getresponse()
print r1.status, r1.reason, r1.read()
