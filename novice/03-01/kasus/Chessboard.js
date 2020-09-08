
var temp = ""
for (let index = 0; index < 8; index++) {
    for (let index2 = 0; index2 < 8; index2++) {
                
        if ((index+index2)%2 === 0) {
            //console.log("#"+" ");
            temp = temp+" #";
        }
        else{
            //console.log(" ")
            temp = temp+"  ";
        }
    }
    console.log(temp);
    temp = "";
}
