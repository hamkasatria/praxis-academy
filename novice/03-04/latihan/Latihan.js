

// RUNTIE ERROR (memanggil openObjek() yang tidak ada )
var windowObject;
var windowFeatures = "menubar=yes,location=yes,resizable=yes,scrollbars=yes,status=yes";

function openPopup() {
  windowObject = window.openObject("http://www.bbc.com/", "BBC_WindowName", strWindowFeatures);
}

var myFunc = function(cb) {
    doSomething
    (function (err, a) 
        {
            if (err) return cb(err)
            doSomethingElse
            (function (err, b) 
                {
                    if (err) return cb(err)
                    return cb(null, [a, b])
                }
            )
        }
    )
  }

  myFunc()