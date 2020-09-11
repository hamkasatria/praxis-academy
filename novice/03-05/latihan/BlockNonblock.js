var fs = require('fs');
//blocking


var contents = fs.readFileSync('file.txt', 'utf8');
// this line is not reached until the read results are in
console.log(contents);

//non-blocking


fs.readFile('file.txt', 'utf8', function(err, data) {
    // called at a later time when the results are in
    console.log(data)
});
// readFile returns immediately and this line is reached right away
