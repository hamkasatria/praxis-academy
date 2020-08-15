
#!/bin/bash
loc=$1


if [ -z "$(find $loc -iname "*.java")" ]
then
      echo "is NULL"
else
      echo -e "Ada file java pada direktori :\n$(find $loc -iname "*.java")"
fi
