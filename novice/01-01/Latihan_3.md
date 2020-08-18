Perintah yang digunakan untuk mengistal JDK dari file tar.gz
1. membuat file
$ sudo mkdir -p /usr/lib/jvm
2. mengekstrak dan meletakkan file di direktori tersebut
$ sudo tar zxvf jdk-11.0.2_linux-x64_bin.tar.gz  -C /usr/lib/jvm
3.memberitahukan sistem bahwa Oracle Java JRE tersedia untuk digunakan.
$ sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk-11.0.2/bin/java" 1
4.Memberitahu sistem bahwa Oracle Java JDK/JRE harus menjadi default Java.
$ sudo update-alternatives --set java /usr/lib/jvm/jdk-11.0.2/bin/java
5. cek versi jdk
$ java --version
