// nodejs script to start a http server with the feed from this directory
// default is port 4000

var express = require('express')
var serveIndex = require('serve-index')
var serveStatic = require('serve-static')

var app = express()

app.use('/', serveStatic(__dirname + '/../build/tmp-glibc/deploy/ipk/'))
app.use('/', serveIndex(__dirname +'/../build/tmp-glibc/deploy/ipk/'))

console.log("Feed server started on port 4000")
app.listen(4000)
